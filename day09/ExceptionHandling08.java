package PracticeSet.atlaslearnings.day09;

class MyException extends Exception {
    public MyException(String m) {
        super(m);
    }
}
public class ExceptionHandling08 {
    public static void main(String[] args) {
        try {
            // Throw an object of user-defined exception
            throw new MyException("This is a custom exception");
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
