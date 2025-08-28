package linkedList.SinglyLinkedList;

import java.util.Stack;

public class p3_Print_linked_list_in_reverse {
    public static void main(String[] args) {
        linkedList3 linkedList = new linkedList3();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.print();
    }
}

class linkedList3{
    Node3 head, tail;

    public void insert(int data){
        Node3 n1 = new Node3(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void print() {
        Node3 temp = head;
        Stack<Integer> stack = new Stack<>();

        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}


class Node3{
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
    }
}