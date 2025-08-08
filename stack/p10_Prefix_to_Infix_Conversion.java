package stack;

import java.util.Stack;

public class p10_Prefix_to_Infix_Conversion {
    public static void main(String[] args) {
        String prefix = "*+ab-cd";
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            // If operand, push to stack
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                stack.push(String.valueOf(ch));
            }
            // If operator
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr = "(" + op1 + ch + op2 + ")";
                stack.push(expr);
            }
        }
        System.out.println("Infix: " + stack.peek());
    }
}
