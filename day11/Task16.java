package PracticeSet.atlaslearnings.day11;

import java.util.Arrays;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {

        List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5,2,4,5,6,7,8);
        System.out.println(intValues.stream().filter(x->x%2==0).distinct().toList());
    }
}
