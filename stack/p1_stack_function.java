package stack;

import java.util.Arrays;

public class p1_stack_function {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        System.out.println(isEmpty(top));
        top = push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,30);
        peek(stack,top);
        top = push(stack,top,40);
        System.out.println(size(top));
        top = push(stack,top,50);
        top = pop(top);
        top = push(stack,top,60);
        System.out.println(Arrays.toString(stack));
    }

    private static int push(int[] stack, int top, int val){
        if (top == stack.length - 1){
            System.out.println("Stack overflow");
            return top;
        }
        top++;
        stack[top] = val;
        return top;
    }

    private static int pop(int top){
        if (top == -1){
            System.out.println("Stack is underflow");
            return top;
        }
        top--;
        return top;
    }

    private static void peek(int[] stack, int top){
        if (top == -1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("peek is " + stack[top]);
    }

    private static boolean isEmpty(int top){
        if (top == -1){
            return true;
        }
        return false;
    }

    private static int size(int top){
        return top+1;
    }

}
