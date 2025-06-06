package PracticeSet.atlaslearnings;

public class Task006 {

    static void check(int a, int b){
       String result = (a>b)?a+" is greater than "+b: b+" is greater than "+a;
        System.out.println(result);
    }

    public static void main(String[] args) {
        check(5,8);
    }
}
