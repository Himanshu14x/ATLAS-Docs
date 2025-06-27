package PracticeSet.atlaslearnings.day12;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(14, 999);
        map.put(13, 888);
        for (int i = 0; i < 100; i++) {
            map.put(i, i);
        }


        System.out.println(map);



        map.put(null, 103);
        map.put(5, null);
        System.out.println(map);


    }
}