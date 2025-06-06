package PracticeSet.atlaslearnings;

public class Task004 {
    public static void main(String[] args) {
swapNumbers(5,4);
    }

    static void swapNumbers(int a, int b){
       int temp = a;
       a = b;
       b = temp;

        System.out.println("Two numbers after swapping are: "+a+" "+b);

    }
}
