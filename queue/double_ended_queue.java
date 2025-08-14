package queue;

import java.util.Arrays;

public class double_ended_queue {
    public static int[] queue = new int[5];
    public static int front=-1, rear=-1;

    public static void main(String[] args) {
        insertFirst(10);
        insertFirst(20);
        insertFirst(30);
        insertFirst(40);
        insertFirst(50);
        deleteLast();
        deleteFirst();
        insertLast(10);
        print();
    }
    private static void print(){
        if (front==-1){
            return;
        }
        for (int i=front; i<=rear; i++){
            System.out.print(queue[i]+ " ");
        }
    }

    private static void insertFirst(int value){
        if (front == -1){
            front = rear = 0;
            queue[front] = value;
        }else if (front == 0 && rear == queue.length-1){
            System.out.println("full");
        }else if (front > 0){
            front--;
            queue[front] = value;
        }else {
            for (int i=rear;i>=0;i--){
                queue[i+1] = queue[i];
            }
            rear++;
            queue[front] = value;
        }
    }

    private static void insertLast(int value){
        if (front == -1){
            front = rear = 0;
            queue[front] = value;
        }else if (front == 0 && rear == queue.length-1){
            System.out.println("full");
        }else if (rear < queue.length-1){
            rear++;
            queue[rear] = value;
        }else {
            for (int i=0;i<rear;i++){
                queue[i] = queue[i+1];
            }
            front--;
            queue[rear] = value;
        }
    }

    private static void deleteFirst(){
        if (front == rear){
            front = rear = -1;
        }
        else if (front == -1){
            System.out.println("empty");
        }else {
            front++;
        }
    }

    private static void deleteLast(){
        if (front == rear){
            front = rear = -1;
        }
        else if (rear == -1){
            System.out.println("empty");
        }else {
            rear--;
        }
    }
}
