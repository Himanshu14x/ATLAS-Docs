package PracticeSet.atlaslearnings.day13;

import java.util.*;
import java.util.LinkedList;

public class Task17 {
    public static void main(String[] args)     {
        //Task 17, 18,19, 20
        HashMap<String, Integer> hm2 = new HashMap<>(10, 0.75F);
        for (int i = 1; i < 15; i++) {
            hm2.put("Element"+i,i);
        }
        HashMap<String, Integer> hm3 = new HashMap<>( hm2);

        for(Map.Entry<String, Integer> map : hm2.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
        hm3.values().forEach(System.out::println);
    }
}
