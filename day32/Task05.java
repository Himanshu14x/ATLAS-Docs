package PracticeSet.atlaslearnings.day32;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest;
import software.amazon.awssdk.services.dynamodb.model.DeleteItemResponse;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Deleting item from DynamoDB table...");

        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeAccesskey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))  // DynamoDB Local
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        String tableName = "Employees02";

        try {

            Map<String, AttributeValue> key = new HashMap<>();
            key.put("ID", AttributeValue.builder().n("1005").build());


            DeleteItemRequest deleteRequest = DeleteItemRequest.builder()
                    .tableName(tableName)
                    .key(key)
                    .returnValues("ALL_OLD")
                    .build();


            DeleteItemResponse response = client.deleteItem(deleteRequest);


            if (response.hasAttributes()) {
                System.out.println("Deleted item: " + response.attributes());
            } else {
                System.out.println("Item not found with ID=1001");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
    }
}

