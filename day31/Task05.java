package PracticeSet.atlaslearnings.day31;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;
import software.amazon.awssdk.services.dynamodb.model.ListTablesRequest;
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse;


import java.util.List;


public class Task05 {
    void tablesList(DynamoDbClient client){


        System.out.println("display existing tables in the DynamoDB server");
        boolean tables = true;
        String lastName = null;


        while (tables) {
            try {
                ListTablesResponse res = null;
                if (lastName == null) {
                    ListTablesRequest req = ListTablesRequest.builder().build();
                    res = client.listTables(req);
                } else {
                    ListTablesRequest req = ListTablesRequest.builder()
                            .exclusiveStartTableName(lastName).build();
                    res = client.listTables(req);
                }


                List<String> namesOfTables = res.tableNames();
                if (!namesOfTables.isEmpty()) {
                    for (String currentName : namesOfTables) {
                        System.out.format("* %s\n", currentName);
                    }
                } else {
                    System.out.println("No tables found!");
                    System.exit(0);
                }


                lastName = res.lastEvaluatedTableName();
                if (lastName == null) {
                    tables = false;
                }


            } catch (DynamoDbException ex) {
                System.err.println(ex.getMessage());
                System.exit(1);
            }
        }
        System.out.println("\nDone!");
    }
    public static void main(String[] args) {
        DynamoDBConnection obj = new DynamoDBConnection();
        DynamoDbClient client = obj.dynamoDBConnection();


        Task05 obj2 = new Task05();
        obj2.tablesList(client);
    }
}
