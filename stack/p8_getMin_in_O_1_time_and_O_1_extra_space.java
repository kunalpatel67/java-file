package stack;

import java.util.Stack;

public class p8_getMin_in_O_1_time_and_O_1_extra_space {
    static Stack<Integer> stack=new Stack<>();
    static int min;

    public static void main(String[] args) {
        push(10);
        push(2);
        push(3);
        push(1);
        push(8);

        getMin();
    }

    private static void getMin() {
        System.out.println(min);
    }

    private static void pop() {
        if(stack.peek()<min)
        {
            min=2*min-stack.pop();
        }
        else {
            stack.pop();
        }
    }

    public static void push(int n){
        if(n<min || stack.isEmpty())
        {
            stack.push(2*n-min);
            min=n;
        }
        else {
            stack.push(n);
        }
    }
}
