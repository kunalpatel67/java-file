package queue;

import java.util.Stack;

public class p7A_Implement_Queue_using_2_Stacks_Insert_Heavy {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        pop();


        System.out.println(stack);
    }

    private static void push(int val) {
        // Move all elements from stack to temp
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        // Push new element to stack
        stack.push(val);

        // Move back all elements from temp to stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }



    }

    private static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        stack.pop();
    }

}
