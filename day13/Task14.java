package PracticeSet.atlaslearnings.day13;


import java.util.*;
import java.util.LinkedList;

public class Task14 {
    public static void main(String[] args) {
       LinkedList<String> lobj = new LinkedList<>();
        lobj.add("Prasunamba");
        lobj.add("amitabh");
        lobj.add("Meher");
        lobj.add("Himanshu");
        lobj.add("Akshit");
        lobj.add("Brijesh");
        Spliterator<String> sitobj = lobj.spliterator();
  lobj.spliterator().forEachRemaining(System.out::println);
        System.out.println("Splitting the list:");
        sitobj.forEachRemaining(System.out::println);
    }
}
