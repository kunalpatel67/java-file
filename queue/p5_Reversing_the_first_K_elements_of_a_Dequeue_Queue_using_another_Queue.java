package queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class p5_Reversing_the_first_K_elements_of_a_Dequeue_Queue_using_another_Queue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addLast(50);

        int k = 3;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++){
            queue.add(deque.poll());
        }

        while (!queue.isEmpty()){
            deque.addFirst(queue.poll());
        }

        System.out.println(deque);
    }
}
