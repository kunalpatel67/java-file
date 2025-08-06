package stack;

import java.util.Stack;

public class p11_Postfix_to_Infix_Conversion {
    public static void main(String[] args) {
        String postfix = "ab+cd-*";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // If operand, push to stack
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                stack.push(String.valueOf(ch));
            }
            // If operator
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr = "(" + op2 + ch + op1 + ")";
                stack.push(expr);
            }
        }
        System.out.println("Infix: " + stack.peek());
    }
}
