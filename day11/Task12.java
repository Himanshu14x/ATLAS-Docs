package PracticeSet.atlaslearnings.day11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Himanshu", "Brijesh", "Akshit", "Ajit","Nishant");
        int count = (int)(names.stream().filter(x->x.startsWith("A")).count());
        System.out.println(count);

        List<String> fullName = new ArrayList<>();
        fullName.add("Himanshu, Rajpoot");
        fullName.add("Hitasha, Jain");
        fullName.add("Harshita Khandelwal");
        fullName.add("Akshit, Gupta");
        fullName.add("Amitabh, Verma");
        fullName.add("Ajit, Bathla");
        fullName.add("Nishant, Mittal");

        System.out.println(fullName);
        fullName.stream().filter(x->x.startsWith("H")).sorted().map(String::toUpperCase).forEach(System.out::println);

    }
}
