package stack;

public class p15_Implement_two_Stacks_in_an_Array {
    static int[] stack=new int[10];
    static int top1=-1;
    static int top2=stack.length;

    public static void main(String[] args) {
        push1(10);
        push1(20);
        push1(30);
        push1(40);
        pop1();
        peek1();

        push2(100);
        push2(90);
        pop2();
        peek2();
        printStacks();
    }

    private static void peek2() {
        if(top2==stack.length)
        {
            System.out.println("Stack 2 is Empty");
        }
        else {
            System.out.println("Stack 2: "+stack[top2]);
        }
    }

    private static void pop2() {
        if(top2==stack.length)
        {
            System.out.println("Stack 2 is Underflow");
        }
        else {
            top2++;
        }
    }

    private static void push2(int n2) {
        if((top2-1)==top1 || top2==0)
        {
            System.out.println("Stack is Full");
        }
        else {
            top2--;
            stack[top2]=n2;
        }
    }

    private static void peek1() {
        if(top1==-1)
        {
            System.out.println("Stack 1 is Empty");
        }
        else {
            System.out.println("Stack 1: "+stack[top1]);
        }
    }

    private static void pop1() {
        if(top1==-1)
        {
            System.out.print("Stack 1 is Underflow");
        }
        else {
            top1--;
        }
    }

    private static void push1(int n1) {
        if(top1==stack.length-1 || (top1+1)==top2)
        {
            System.out.println("Stack is Full");
        }
        else {
            top1++;
            stack[top1]=n1;
        }
    }

    static void printStacks() {
        System.out.print("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();

        System.out.print("Stack 2: ");
        for (int i = stack.length - 1; i >= top2; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
