package PracticeSet.atlaslearnings.day11;


import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task19 {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(1,x->x+1).limit(20).collect(Collectors.toList());
        System.out.println(collect);
collect.stream().toList();
        collect.stream().limit(10).skip(5).forEach(System.out::println);

        List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5,2,4,5,6,7,8);


        System.out.println(intValues.stream().toList());
        System.out.println(intValues.stream().reduce((x,y)->x+y));

        List<String> strings = Arrays.asList("Hello", " ", "World");
        System.out.println( strings.stream().reduce((x,y)->x+y));
    }
}