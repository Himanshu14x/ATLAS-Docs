package PracticeSet.atlaslearnings.day09;

public class ExceptionHandling07 {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo exception by fun method");
    }

    public static void main(String[] args) {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}


