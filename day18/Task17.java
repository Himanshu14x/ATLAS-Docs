package PracticeSet.atlaslearnings.day18;

import java.util.*;

public class Task12 {


    public static void radixSort(List<Integer> v, int d) {
        int power = 1;


        List<Queue<Integer>> digitQueues = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            digitQueues.add(new LinkedList<>());
        }

        for (int i = 0; i < d; i++) {
            distribute(v, digitQueues, power);
            collect(digitQueues, v);
            power *= 10;
        }
    }


    public static void distribute(List<Integer> v, List<Queue<Integer>> digitQueues, int power) {
        for (int num : v) {
            int digit = (num / power) % 10;
            digitQueues.get(digit).add(num);
        }
    }


    public static void collect(List<Queue<Integer>> digitQueues, List<Integer> v) {
        v.clear();
        for (Queue<Integer> queue : digitQueues) {
            while (!queue.isEmpty()) {
                v.add(queue.poll());
            }
        }
    }


    public static int getMaxDigits(List<Integer> v) {
        int max = Collections.max(v);
        return Integer.toString(max).length();
    }


    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>(Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66));
        int maxDigits = getMaxDigits(v);

        System.out.println("Original list: " + v);
        radixSort(v, maxDigits);
        System.out.println("Sorted list: " + v);
    }
}
