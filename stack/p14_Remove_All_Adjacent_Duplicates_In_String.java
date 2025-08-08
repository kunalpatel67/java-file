package stack;

import java.util.Stack;

public class p14_Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (stack.isEmpty() || s.charAt(i) != stack.peek()){
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
            }
        }
        System.out.println(stack);
    }
}
