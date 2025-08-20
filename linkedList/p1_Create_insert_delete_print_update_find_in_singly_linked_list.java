package linkedList;

public class p1_Create_insert_delete_print_update_find_in_singly_linked_list {
    public static void main(String[] args) {
        linkedList linkedList = new linkedList();
        linkedList.isEmpty();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.update(20,200);
        linkedList.delete(50);
        linkedList.print();
        linkedList.find(200);
        linkedList.isEmpty();
        linkedList.size();
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

    public void delete(int val) {
        // list empty
        if (head == null) {
            System.out.println("List is empty, can't delete value");
            return;
        }

        // delete value head ho
        if (head.data == val) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        // delete value tail ho
        if (tail.data == val) {
            Node temp = head;
            while (temp.next != tail) {  // tail ke pehle wali node find karo
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            return;
        }

        // delete value head aur tail nahi ho
        Node prev = null;
        Node curr = head;

        // jab value mile to loop exit karega
        while (curr != null && curr.data != val) {
            prev = curr;
            curr = curr.next;
        }

        // i/p:- 10,20,30,40,50  Del:-30 then prev = 20, curr = 30 after loop

        if (curr == null) { // value not found
            System.out.println("Value not found in list");
            return;
        }

        prev.next = curr.next;
    }

    public void print() {
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