package stack;

import java.util.Stack;

public class p5_Check_if_string_is_palindrome_or_not_using_stack {
    public static void main(String[] args) {
        String s = "nitin";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }

        int i = 0;

        while (!stack.isEmpty()){
            char ch = stack.pop();
            if (ch != s.charAt(i)){
                System.out.println("String is not palindrome");
                return;
            }
            i++;
        }
        System.out.println("String is palindrome");
    }
}
