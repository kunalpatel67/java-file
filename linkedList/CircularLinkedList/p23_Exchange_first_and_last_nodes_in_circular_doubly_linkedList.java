package linkedList.CircularLinkedList;

public class p23_Exchange_first_and_last_nodes_in_circular_doubly_linkedList {
    public static void main(String[] args) {
        doublyLinkedList23 doublyLinkedList = new doublyLinkedList23();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);

        doublyLinkedList.exchangeFirstLast();
        doublyLinkedList.print();
    }
}

class doublyLinkedList23 {
    Node23 head;

    public void insert(int data) {
        Node23 n1 = new Node23(data);
        if (head == null){
            head = n1;
            head.next = head;
            head.prev = head;
        }
        else {
            Node23 temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = n1;
            n1.prev = temp;
            n1.next = head;
            head.prev = n1;
        }
    }

    public void print() {
        Node23 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public void exchangeFirstLast() {
        if (head == null || head.next == head) {
            return;
        }

        Node23 prev = null;
        Node23 curr = head;

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        //Swap node
        prev.next = head;
        curr.next = head.next;
        head.next = curr;
        head.prev = prev;
        curr.prev = head;
        head = curr;
    }
}

class Node23 {
    int data;
    Node23 next, prev;

    public Node23(int data) {
        this.data = data;
    }
}