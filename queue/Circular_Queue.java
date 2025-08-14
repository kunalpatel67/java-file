package queue;

import java.util.Arrays;

public class Circular_Queue {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        enqueue(10);
        System.out.println(isEmpty());
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        dequeue();
        enqueue(60);
        System.out.println(size());
        peek();
        printQueue();
        System.out.println(Arrays.toString(queue));
    }

    private static void enqueue(int val) {
        if (rear == -1){
            front = rear = 0;
            queue[rear] = val;
        }
        else if ((rear + 1) % queue.length == front){
            System.out.println("Queue is full");
            return;
        }
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = val;
        }
    }

    private static void dequeue() {
        if (rear == -1){
            System.out.println("Queue is empty, can't delete value");
            return;
        }

        System.out.println(queue[front] + " is deleted");

        // only one element in queue
        if (rear == front){
            rear = front = -1;
        }
        else {
            front = (front+1) % queue.length;
        }
    }

    private static void peek() {
        if (rear == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Peek is: " + queue[front]);
    }

    private static void printQueue() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }

    private static int size() {
        if (rear == -1) {
            return 0;
        }
        return (rear - front + queue.length) % queue.length + 1;
    }

    private static boolean isEmpty(){
        if (rear == -1){
            return true;
        }
        return false;
    }
}
