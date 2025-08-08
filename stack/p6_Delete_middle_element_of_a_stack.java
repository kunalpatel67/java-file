package stack;

import java.util.Stack;

public class p6_Delete_middle_element_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        if (stack.size() % 2 == 0){
            System.out.println("Can't find middle value");
        }

        Stack<Integer> temp = new Stack<>();
        int n = stack.size();
        int mid = n / 2;

        // last two element store in temp
        for (int i = 0; i < mid; i++) {
            temp.push(stack.pop());
        }

        stack.pop(); // middle delete

        // last two element store in original stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println(stack);
    }
}
