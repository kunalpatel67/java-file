package stack;

import java.util.Stack;

public class p12_Prefix_to_Postfix_Conversion {
    public static void main(String[] args) {
        String prefix = "*+ab-cd";
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--){
            char ch = prefix.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                stack.push(String.valueOf(ch));
            }
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr =  op1 + op2 + ch;
                stack.push(expr);
            }
        }
        System.out.println("Postfix: " + stack.peek());
    }
}
