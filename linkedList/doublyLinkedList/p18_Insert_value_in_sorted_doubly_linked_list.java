package linkedList.doublyLinkedList;

import java.util.LinkedList;

public class p18_Insert_value_in_sorted_doubly_linked_list {
    public static void main(String[] args) {
        doublyLinkedList18 linkedList = new doublyLinkedList18();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.sortedInsert(30);
        linkedList.print();

    }
}

class doublyLinkedList18 {
    Node18 head, tail;

    public void insert(int data) {
        Node18 n1 = new Node18(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void sortedInsert(int val){
        Node18 n1 = new Node18(val);
        if (head == null){
            head = tail = n1;
        }
        else if (val <= head.data){
            Node18 temp = head;
            head.prev = n1;
            head = n1;
            head.next = temp;
        }
        else if (val >= tail.data){
            Node18 temp = tail;
            tail.next = n1;
            tail = n1;
            tail.prev = temp;
        }
        else {
            Node18 curr = head;
            while (curr.data < val){
                curr = curr.next;
            }
            Node18 temp = curr.prev;
            curr.prev = n1;
            n1.next = curr;
            temp.next = n1;
            n1.prev = temp;
        }
    }

    public void print() {
        Node18 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Node18{
    int data;
    Node18 next, prev;

    public Node18(int data) {
        this.data = data;
    }
}