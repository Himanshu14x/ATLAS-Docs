package PracticeSet.atlaslearnings.day09;
import java.util.ArrayList;
public class Task09 {
        public static void main (String[] args) {
            ArrayList a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add("Hello");
            System.out.println(a);
            System.out.println(a.get(3).getClass().getName());
        }
    }


