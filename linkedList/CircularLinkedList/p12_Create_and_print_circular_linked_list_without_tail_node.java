package linkedList.CircularLinkedList;

public class p12_Create_and_print_circular_linked_list_without_tail_node {
    public static void main(String[] args) {
        linkedList12 linkedList = new linkedList12();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.print();
    }
}

class linkedList12 {
    Node12 head;

    public void insert(int data){
        Node12 n1 = new Node12(data);
        if (head == null){
            head = n1;
            head.next = head;
        }
        else {
            Node12 temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = n1;
            n1.next = head;
        }
    }

    public void print(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node12 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}

class Node12 {
    int data;
    Node12 next;

    public Node12(int data) {
        this.data = data;
    }
}
