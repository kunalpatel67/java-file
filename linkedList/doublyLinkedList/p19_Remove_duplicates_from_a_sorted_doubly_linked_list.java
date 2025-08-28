package linkedList.doublyLinkedList;

public class p19_Remove_duplicates_from_a_sorted_doubly_linked_list {
    public static void main(String[] args) {
        doublyLinkedList19 doublyLinkedList = new doublyLinkedList19();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        doublyLinkedList.insert(50);
        doublyLinkedList.removeDuplicates();
        doublyLinkedList.print();
    }
}

class doublyLinkedList19 {
    Node19 head, tail;

    public void insert(int data) {
        Node19 n1 = new Node19(data);
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
        Node19 curr = head;
        while (curr != null && curr.next != null){
            if (curr.data == curr.next.data){
                Node19 nextNext = curr.next.next;
                curr.next = nextNext;

                if (nextNext != null){
                    nextNext.prev = curr;
                }
                else {
                    tail = curr;
                }
            }

            else {
                curr = curr.next;
            }
        }
    }

    public void print() {
        Node19 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node19 {
    int data;
    Node19 next, prev;

    public Node19(int data) {
        this.data = data;
    }
}
