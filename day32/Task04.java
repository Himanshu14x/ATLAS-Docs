package PracticeSet.atlaslearnings.day32;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Updating item in DynamoDB table...");

        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeAccesskey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))  // DynamoDB Local
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        String tableName = "Employees02";

        try {

            Map<String, AttributeValue> key = new HashMap<>();
            key.put("ID", AttributeValue.builder().n("1001").build());


            UpdateItemRequest updateRequest = UpdateItemRequest.builder()
                    .tableName(tableName)
                    .key(key)
                    .updateExpression("SET Address = :newAddress")
                    .expressionAttributeValues(Map.of(
                            ":newAddress", AttributeValue.builder().s("New Delhi, India").build()
                    ))
                    .returnValues(ReturnValue.UPDATED_NEW)
                    .build();

            UpdateItemResponse response = client.updateItem(updateRequest);


            System.out.println("Updated item: " + response.attributes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
    }
}
