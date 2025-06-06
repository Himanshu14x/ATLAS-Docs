package PracticeSet.atlaslearnings;
import java.util.Scanner;

public class Task012 {

    static void login(){
        String id = "Himanshu";
        String pass = "1234";
        int attempt = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please enter your userID");
            String userID = scanner.nextLine();
            System.out.println("Please enter your password");
            String password = scanner.nextLine();

            if(userID.equals(id) && password.equals(pass)){
                System.out.println("Access granted!");
                break;
            } else {
                attempt++;
                if(attempt == 3){
                    System.out.println("Maximum attempts reached");
                    break;
                }
                System.out.println("try again!");
                System.out.println();

            }





        } while(attempt<=3);


    }
    public static void main(String[] args) {
login();
    }
}
