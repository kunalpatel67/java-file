package linkedList.CircularLinkedList;

public class p14_Exchange_first_and_last_nodes_in_Circular_singly_Linked_List {
    public static void main(String[] args) {
        linkedList14 linkedList = new linkedList14();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.swapFirstLast();
        linkedList.print();
    }
}

class linkedList14 {
    Node14 head;

    public void insert(int data){
        Node14 n1 = new Node14(data);
        if (head == null){
            head = n1;
            head.next = head;
        }
        else {
            Node14 temp = head;
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

        Node14 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public void swapFirstLast() {
        if (head == null || head.next == head) {
            return;
        }

        Node14 prev = null;
        Node14 curr = head;

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        //Swap node
        prev.next = head;
        curr.next = head.next;
        head.next = curr;
        head = curr;
    }
}

class Node14 {
    int data;
    Node14 next;

    public Node14(int data)
    {
        this.data = data;
    }
}