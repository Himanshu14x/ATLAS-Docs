package PracticeSet.atlaslearnings.day13;
import java.util.Arrays;
import java.util.LinkedList;

public class Task06 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        // Task 06
        System.out.println(list);
        // Task 07
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println();
        // Task 08
        list.set(1,"Peach");
        // Task 09
        list.stream().forEach(System.out::println);
        System.out.println();
        for (int i = 0; i< list.size(); i++) {
            System.out.println( list.get(i));
        }

        // Task 10
        System.out.println(list);
        System.out.println();

        // Task 11
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        // Task 12
        LinkedList<String> list2 = (LinkedList<String>)list.clone();
        System.out.println("List2"  +list2);

        // Task 13
        list.pop();
        list.push("Grapes");
        list.push("Guava");
        System.out.println(list);
        System.out.println("Again list 2"+ list2);


        list.spliterator().forEachRemaining(System.out::println);
    }
}
