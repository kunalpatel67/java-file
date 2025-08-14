package queue;

import java.util.Arrays;

public class simple_queue {
    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        enqueue(40);
        enqueue(50);
        peek();
        System.out.println(size());
        System.out.println(Arrays.toString(queue));
    }

    private static void enqueue(int val){
        if (rear == queue.length - 1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = val;
    }

    private static void dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty, can't delete");
            return;
        }
        front++;
        System.out.println(queue[front] + " is deleted");

        if (front == rear){
            front = rear = -1;
        }
    }

    private static void peek(){
        if (isEmpty()){
            System.out.println("empty");
            return;
        }

        System.out.println("peek is: " + queue[front+1]);
    }

    private static int size(){
        return rear-front;
    }

    private static boolean isEmpty(){
        if (front == rear){
            return true;
        }
        return false;
    }
}
