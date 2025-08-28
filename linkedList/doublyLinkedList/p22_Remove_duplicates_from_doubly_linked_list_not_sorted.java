package linkedList.doublyLinkedList;

public class p22_Remove_duplicates_from_doubly_linked_list_not_sorted {
    public static void main(String[] args) {
        doublyLinkedList22 doublyLinkedList = new doublyLinkedList22();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(5);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(200);
        doublyLinkedList.insert(5);
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(100);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(10);

        doublyLinkedList.print();
        doublyLinkedList.removeDuplicates();
        doublyLinkedList.print();
    }
}

class doublyLinkedList22 {
    Node22 head, tail;

    public void insert(int data) {
        Node22 n1 = new Node22(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void removeDuplicates() {
        Node22 curr = head;
        while (curr != null && curr.next != null){
            Node22 temp = curr.next;
            Node22 prev = curr;
            while (temp != null){
                if (temp.data == curr.data){
                    prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = prev;
                    }
                    else {
                        tail = prev;
                    }
                    temp = temp.next;
                }
                else {
                    prev = temp;
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
    }

    public void print() {
        Node22 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node22 {
    int data;
    Node22 next, prev;

    public Node22(int data) {
        this.data = data;
    }
}