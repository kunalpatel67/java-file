package linkedList.CircularLinkedList;

public class p13_Check_if_linked_list_is_circular_linked_list {
    public static void main(String[] args) {
        linkedList13 linkedList = new linkedList13();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        System.out.println(linkedList.isCircular());
        linkedList.makeCircular();
        System.out.println(linkedList.isCircular());
    }
}

class linkedList13 {
    Node13 head, tail;

    public void insert(int data){
        Node13 n1 = new Node13(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void makeCircular() {
        if (tail != null) {
            tail.next = head;
        }
    }

    public boolean isCircular() {
        if (head == null){
            return false;
        }

        Node13 temp = head.next;
        while (temp != null){
            if (temp == head) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

class Node13 {
    int data;
    Node13 next;

    public Node13(int data)
    {
        this.data = data;
    }
}