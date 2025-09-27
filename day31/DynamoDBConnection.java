package PracticeSet.atlaslearnings.day31;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.net.URI;

public class DynamoDBConnection {

    public DynamoDbClient dynamoDBConnection() {
        System.out.println("Connecting to DynamoDB...");


        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");


        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        System.out.println(" Connected to DynamoDB successfully.");
        return client;
    }


    public void closeConnection(DynamoDbClient client) {
        if (client != null) {
            client.close();
            System.out.println("🔒 DynamoDB connection closed.");
        }
    }
}
