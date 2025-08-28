package linkedList.SinglyLinkedList;

public class p7_Print_middle_node_of_the_linked_list {
    public static void main(String[] args) {
        linkedList7 linkedList = new linkedList7();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.getMiddleNode();
    }
}

class linkedList7 {
    Node7 head, tail;

    public void insert(int data){
        Node7 n1 = new Node7(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void getMiddleNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node7 slow = head;
        Node7 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);
    }
}

class Node7 {
    int data;
    Node7 next;

    public Node7(int data) {
        this.data = data;
    }
}