package PracticeSet.atlaslearnings.day11;

import java.util.Arrays;

@FunctionalInterface
interface MyInterface{

    // abstract method
    double getPiValue();
}

public class Task09 {

    public static void main( String[] args ) {

        // declare a reference to MyInterface
        MyInterface ref;

        // lambda expression
        ref = () -> 3.1415;

        System.out.println("Value of Pi = " + ref.getPiValue());
    }
}
