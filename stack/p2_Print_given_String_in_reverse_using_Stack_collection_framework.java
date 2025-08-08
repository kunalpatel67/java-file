package stack;

import java.util.Stack;

public class p2_Print_given_String_in_reverse_using_Stack_collection_framework {
    public static void main(String[] args) {
        String s = "hello good morning";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
