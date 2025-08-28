package linkedList.SinglyLinkedList;

public class p1_Create_insert_delete_print_update_find_in_singly_linked_list {
    public static void main(String[] args) {
        linkedList linkedList = new linkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(30);
        linkedList.insert(30);
        linkedList.delete(30);

        linkedList.print();
    }
}

class linkedList{
    Node head, tail;

    public void insert(int data){
        Node n1 = new Node(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void delete(int v) {
        if (head == null){
            System.out.println("list is empty, can't delete data");
            return;
        }
        if (head == tail && head.data == v){
            head = tail = null;
        }
        else if (head.data == v){
            Node temp = head;
            head = head.next;
            temp.next = null;
            delete(v);
        }
        else if(tail.data == v){
            Node prev = head;
            while (prev.next != tail){
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
            delete(v);
        }
        else {
            Node prev = head;
            while (prev.next != null && prev.next.data != v){
                prev = prev.next;
            }
            if (prev.next == null){
                return;
            }

            Node temp = prev.next;
            prev.next = prev.next.next;
            temp.next = null;
            delete(v);
        }
    }

    public void print() {
        if (head == null){
            System.out.println("...EMPTY...");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void update(int oldV, int newV) {
        Node temp = head;
        while (temp != null){
            if (temp.data == oldV){
                temp.data = newV;
            }
            temp = temp.next;
        }
    }

    public void find(int val) {
        Node temp = head;
        while (temp != null){
            if (temp.data == val){
                System.out.println("Present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Present");
    }

    public void isEmpty() {
        if (head == null){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public void size() {
        Node temp = head;
        int c = 0;
        while (temp != null){
            c++;
            temp = temp.next;
        }
        System.out.println(c);
    }
}


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}