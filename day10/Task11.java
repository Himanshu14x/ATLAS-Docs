package PracticeSet.atlaslearnings.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
class DoubleColonOp {
    public static void main(String[] args) {
        Stream<String> stream  = Stream.of("Hello", "My", "name", "is", "Prasunamba", ".MK");

        stream.forEach(System.out::println);

        List<String> names = Arrays.asList("Hello", "My", "Name", "is", "Himanshu");
        names.stream().forEach(System.out::println);

        names.stream().filter(x->x.startsWith("H")).forEach(System.out::println);
    }
}

