package queue;

import java.util.Stack;

public class p7B_Implement_Queue_using_2_Stacks_Delete_Heavy {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {
        push(10);
        pop();
        push(20);
        push(30);
        push(40);
        push(50);
        pop();
        push(60);
        pop();


        System.out.println(stack);
    }

    private static void push(int val){
        stack.push(val);
    }

    private static void pop(){
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, Can't delete");
            return;
        }

        int sizeOfStack = stack.size();
        for (int i = sizeOfStack-1; i > 0; i--){
            temp.push(stack.pop());
        }

        stack.pop();

        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }
}
