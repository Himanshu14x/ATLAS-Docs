package PracticeSet.atlaslearnings.day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> intValues = Arrays.asList(1,2,3,4,5);
        intValues.stream().map(x->x*x).forEach(System.out::println);


        List<Integer> squareofNums = intValues.stream().map(num->num*num).toList();
        System.out.println(squareofNums);

    }
}
