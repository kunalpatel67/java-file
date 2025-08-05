package stack;

import java.util.Stack;

public class p8_getMin_in_O_1_time_and_O_1_extra_space {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;

        stack.push(10);
        if (stack.peek() < min){
            min = stack.peek();
        }

        stack.push(20);
        if (stack.peek() < min){
            min = stack.peek();
        }

        stack.push(0);
        if (stack.peek() < min){
            min = stack.peek();
        }

        stack.push(50);
        if (stack.peek() < min){
            min = stack.peek();
        }

        stack.push(5);
        if (stack.peek() < min){
            min = stack.peek();
        }

        System.out.println("Original Stack: " + stack);
        System.out.println("Min value: " + min);
    }
}
