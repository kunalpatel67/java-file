package linkedList.SinglyLinkedList;

public class p8_Detect_loop {
    public static void main(String[] args) {
        linkedList8 linkedList = new linkedList8();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        // last node -> points to 3rd node
        linkedList.head.next.next.next.next.next = linkedList.head.next.next;
        System.out.println(linkedList.detectLoop());
    }
}

class linkedList8 {
    Node8 head, tail;

    public void insert(int data){
        Node8 n1 = new Node8(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public boolean detectLoop() {
        Node8 slow = head;
        Node8 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

class Node8 {
    int data;
    Node8 next;

    public Node8(int data) {
        this.data = data;
    }
}
