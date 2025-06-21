package PracticeSet.atlaslearnings.day11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task18 {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(1,x->x+1).limit(20).collect(Collectors.toList());
        System.out.println(collect);

        collect.stream().limit(10).forEach(System.out::println);

    }
}