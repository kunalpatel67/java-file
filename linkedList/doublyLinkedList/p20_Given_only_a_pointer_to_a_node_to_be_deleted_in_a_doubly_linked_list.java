package linkedList.doublyLinkedList;

public class p20_Given_only_a_pointer_to_a_node_to_be_deleted_in_a_doubly_linked_list {
    public static void main(String[] args) {
        doublyLinkedList20 doublyLinkedList = new doublyLinkedList20();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        
        Node20 nodeToDelete = doublyLinkedList.head.next;
        doublyLinkedList.delete(nodeToDelete);
        doublyLinkedList.print();
    }
}

class doublyLinkedList20 {
    Node20 head, tail;

    public void insert(int data) {
        Node20 n1 = new Node20(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void delete(Node20 node) {
        if (node == null){
            return;
        }

        if (node == head) {
            head = node.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        if (node == tail) {
            tail = node.prev;
            if (tail != null) {
                tail.next = null;
            }
            return;
        }

        node.prev.next = node.next; // 10.next = 30
        node.next.prev = node.prev; // 30.prev = 10
    }

    public void print() {
        Node20 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node20 {
    int data;
    Node20 next, prev;

    public Node20(int data) {
        this.data = data;
    }
}