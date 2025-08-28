package linkedList.doublyLinkedList;

public class p15_Create_insert_delete_print_doubly_linked_list {
    public static void main(String[] args) {
        doublyLinkedList15 doublyLinkedList = new doublyLinkedList15();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        doublyLinkedList.delete(400);

        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList.printRev();
    }
}

class doublyLinkedList15 {
    Node15 head, tail;

    public void insert(int data) {
        Node15 n1 = new Node15(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void delete(int value){
        if (head == null) {
            System.out.println("List is empty, can't delete data");
            return;
        }

        if (head == tail && head.data == value){
            head = tail = null;
        }
        else if (head.data == value){
            Node15 temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        else if (tail.data == value){
            Node15 temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        else {
            Node15 curr = head;
            while (curr != null && curr.data != value){
                curr = curr.next;
            }

            if (curr == null){
                System.out.println("value not found");
                return;
            }

            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
            curr.next = null;
            curr.prev = null;

        }
    }

    public void print() {
        Node15 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void printRev() {
        Node15 temp = tail;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}

class Node15 {
    int data;
    Node15 next, prev;

    public Node15(int data) {
        this.data = data;
    }
}