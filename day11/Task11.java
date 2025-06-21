package PracticeSet.atlaslearnings.day11;

@FunctionalInterface
interface MyInterface1 {

    // abstract method
    String reverse(String n);
}

public class Task11 {

    public static void main( String[] args ) {


        MyInterface1 ref = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };


        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }

}
