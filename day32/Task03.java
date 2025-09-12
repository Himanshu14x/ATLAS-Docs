package PracticeSet.atlaslearnings.day32;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ScanRequest;
import software.amazon.awssdk.services.dynamodb.model.ScanResponse;

import java.net.URI;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Reading data from table...");

        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeAccesskey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        String tableName = "Employees02";

        try {

            ScanRequest scanRequest = ScanRequest.builder()
                    .tableName(tableName)
                    .build();


            ScanResponse response = client.scan(scanRequest);


            for (Map<String, AttributeValue> item : response.items()) {
                String id = item.get("ID").n();
                String name = item.get("Name").s();
                String address = item.get("Address").s();

                System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
    }
}
