package stack;

import java.util.Arrays;

public class p3_Reverse_individual_words_using_stack {
    public static void main(String[] args) {
        String s = "hello good morning";
        int top = -1;
        char[] stack = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch != ' '){
                top = push(stack,top,s.charAt(i));
            }
            else {
                while (!isEmpty(top)){
                    top = pop(stack,top);
                }
                System.out.print(" ");
            }
        }
        while (!isEmpty(top)){
            top = pop(stack,top);
        }
    }

    private static int push(char[] stack, int top, char val){
        if (top == stack.length - 1){
            System.out.println("Stack overflow");
            return top;
        }

        top++;
        stack[top] = val;
        return top;
    }

    private static int pop(char[] stack, int top){
        System.out.print(stack[top]);
        top--;
        return top;
    }

    private static boolean isEmpty(int top){
        if (top == -1){
            return true;
        }
        return false;
    }
}
