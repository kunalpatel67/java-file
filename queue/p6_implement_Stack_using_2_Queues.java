package queue;

import java.util.LinkedList;
import java.util.Queue;

public class p6_implement_Stack_using_2_Queues {
    static Queue<Integer> queue = new LinkedList<>();
    static Queue<Integer> temp = new LinkedList<>();

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        delete();
        add(40);
        add(50);
        delete();
        add(60);
        delete();

        System.out.println(queue);
    }

    private static void add(int val){
        queue.add(val);
    }

    private static void delete(){
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int n = queue.size();
        for (int i = 0; i < n - 1; i++){
            temp.add(queue.poll());
        }
        queue = temp;
        temp = new LinkedList<>();
    }
}
