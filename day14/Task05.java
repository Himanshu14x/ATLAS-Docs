package PracticeSet.atlaslearnings.day14;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task05 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("Starting while loop");
        while(stack.peek()!=5){
            stack.pop();
        }
        System.out.println("While loop finished");
        System.out.println(stack);
        System.out.println(stack.search(5));
        System.out.println(stack.get(0));
        System.out.println(stack.isEmpty());

    }
}
