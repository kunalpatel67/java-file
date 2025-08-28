package linkedList.SinglyLinkedList;

public class p10_Remove_duplicates_from_a_sorted_linked_list {
    public static void main(String[] args) {
        linkedList10 linkedList = new linkedList10();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(30);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.removeDuplicates();
        linkedList.print();
    }
}

class linkedList10 {
    Node10 head, tail;

    public void insert(int data){
        Node10 n1 = new Node10(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void removeDuplicates() {
        Node10 current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void print() {
        if (head == null){
            System.out.println("...EMPTY...");
        }
        Node10 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node10 {
    int data;
    Node10 next;

    public Node10(int data) {
        this.data = data;
    }
}
