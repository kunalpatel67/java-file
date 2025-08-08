package stack;

import java.util.Stack;

public class p3_Reverse_individual_words_using_stack_collection_framework {
    public static void main(String[] args) {
        String s = "hello good morning";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (ch != ' '){
                stack.push(ch);
            }
            else {
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
