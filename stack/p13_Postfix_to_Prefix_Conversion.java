package stack;

import java.util.Stack;

public class p13_Postfix_to_Prefix_Conversion {
    public static void main(String[] args) {
        String postfix = "ab+cd-*";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++){
            char ch = postfix.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                stack.push(String.valueOf(ch));
            }
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr =  ch + op2 + op1;
                stack.push(expr);
            }
        }
        System.out.println("Prefix: " + stack.peek());
    }
}
