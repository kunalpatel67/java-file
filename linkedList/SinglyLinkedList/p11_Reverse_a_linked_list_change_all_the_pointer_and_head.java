package linkedList.SinglyLinkedList;

public class p11_Reverse_a_linked_list_change_all_the_pointer_and_head {
    public static void main(String[] args) {
        linkedList11 linkedlist = new linkedList11();
        linkedlist.insert(10);
        linkedlist.insert(20);
        linkedlist.insert(30);
        linkedlist.insert(40);

        linkedlist.print();
        System.out.println();
        linkedlist.reverse();
        linkedlist.print();

    }
}

class linkedList11 {
    Node11 head, tail;

    public void insert(int data){
        Node11 n1 = new Node11(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void reverse() {
        Node11 prev = null;
        Node11 next = null;
        Node11 current = head;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;

    }

    public void print() {
        Node11 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node11{
    int data;
    Node11 next;

    public Node11(int data) {
        this.data = data;
    }
}