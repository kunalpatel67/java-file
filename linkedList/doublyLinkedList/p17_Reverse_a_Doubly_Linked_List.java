package linkedList.doublyLinkedList;

public class p17_Reverse_a_Doubly_Linked_List {
    public static void main(String[] args) {
        doublyLinkedList17 linkedList = new doublyLinkedList17();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.print();
        linkedList.rev();
        linkedList.print();
    }
}

class doublyLinkedList17 {
    Node17 head, tail;

    public void insert(int data) {
        Node17 n1 = new Node17(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void rev() {
        Node17 curr = head;
        Node17 temp = null;

        while (curr != null){
            temp = curr.prev;       // temp = null
            curr.prev = curr.next;  // 10.prev = 20
            curr.next = temp;       // 10.next = null
            curr = curr.prev;       // curr = 20
        }
        tail = head;
        head = temp.prev;
    }

    public void print() {
        Node17 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node17 {
    int data;
    Node17 next, prev;

    public Node17(int data) {
        this.data = data;
    }
}