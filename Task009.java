package PracticeSet.atlaslearnings;

import java.util.Scanner;

public class Task009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
