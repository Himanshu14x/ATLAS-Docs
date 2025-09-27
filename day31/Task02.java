package PracticeSet.atlaslearnings.day31;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;


import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Task02 {
    public static void main(String[] args) throws Exception{
        System.out.println("loading data to table ");
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeAccesskey","fakeSecretKey");


        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();
        String tableName = "Employees01";


        ObjectMapper mapper = new ObjectMapper();
        InputStream jsonStream = Task01.class.getClassLoader()
                .getResourceAsStream(("Employee.json"));


        if(jsonStream == null) {
            System.err.println("plz provide json file");
            System.exit(1);
        }


        JsonNode rootNode = mapper.readTree(jsonStream);
        Iterator<JsonNode> iterator = rootNode.elements();


        //now inserting data to your table at port no 8000
        while(iterator.hasNext()) {
            JsonNode node = iterator.next();
            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(node.get("ID").asText()).build());
            item.put("Name", AttributeValue.builder().s(node.get("Name").asText()).build());
            item.put("Address", AttributeValue.builder().s(node.get("Address").asText()).build());


            PutItemRequest putRequest = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();


            client.putItem(putRequest);
            System.out.println("inserted data "+ node.get("ID").asInt()+ " ***** " + node.get("Name").asText()+" $$$ "+node.get("Address").asText());
        }


        client.close();


    }
}
