package linkedList.SinglyLinkedList;

public class p5_Get_nth_node_from_end_in_linked_list {
    public static void main(String[] args) {
        linkedList5 linkedList = new linkedList5();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.printNthNodeFromLast(4);
    }
}

class linkedList5 {
    Node5 head, tail;

    public void insert(int data){
        Node5 n1 = new Node5(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    // print nth node from last
    public void printNthNodeFromLast(int nth) {
        Node5 temp = head;
        int c = size();
        while (temp != null){
            if (c == nth){
                System.out.println("Last " + nth + "th Node: " + temp.data);
                return;
            }
            temp = temp.next;
            c--;
        }
    }

    public int size() {
        Node5 temp = head;
        int c = 0;
        while (temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }
}

class Node5{
    int data;
    Node5 next;

    public Node5(int data) {
        this.data = data;
    }
}