package stack;

import java.util.Stack;

public class p7_getMin_in_O_1_time_from_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        stack.push(5);
        minStack.push(stack.peek());

        stack.push(20);
        minStack.push(Math.min(stack.peek(), minStack.peek()));

        stack.push(0);
        minStack.push(Math.min(stack.peek(), minStack.peek()));

        stack.push(6);
        minStack.push(Math.min(stack.peek(), minStack.peek()));

        stack.push(50);
        minStack.push(Math.min(stack.peek(), minStack.peek()));

        System.out.println("Original Stack: " + stack);
        System.out.println("Min value: " + minStack.peek());
    }
}
