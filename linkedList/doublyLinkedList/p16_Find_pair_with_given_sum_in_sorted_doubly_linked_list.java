package linkedList.doublyLinkedList;

import static linkedList.doublyLinkedList.p16_Find_pair_with_given_sum_in_sorted_doubly_linked_list.k;

public class p16_Find_pair_with_given_sum_in_sorted_doubly_linked_list {
    static int k = 10;
    public static void main(String[] args) {
        doublyLinkedList16 doublyLinkedList = new doublyLinkedList16();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);

        doublyLinkedList.isPair();
    }
}

class doublyLinkedList16 {
    Node16 head, tail;

    public void insert(int data) {
        Node16 n1 = new Node16(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void isPair() {
        Node16 left = head;
        Node16 right = tail;

        while (left != right){
            int sum = left.data + right.data;
            if (sum == k){
                System.out.println("Present");
                return;
            }
            else if (sum < k){
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
        System.out.println("Not present");
    }
}

class Node16 {
    int data;
    Node16 next,prev;

    public Node16(int data) {
        this.data = data;
    }
}