package PracticeSet.atlaslearnings.day09;

public class ExceptionHandling01 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        try{
            System.out.println(myNumbers[10]);
        } catch(Exception e){

            System.out.println(e.getMessage());
        }
    }
}
