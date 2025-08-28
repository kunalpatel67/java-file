package linkedList.SinglyLinkedList;

public class p2_Count_nodes {
    public static void main(String[] args) {
        linkedList2 linkedList = new linkedList2();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.size();
    }
}

class linkedList2{
    Node2 head, tail;

    public void insert(int data){
        Node2 n1 = new Node2(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void size() {
        Node2 temp = head;
        int c = 0;
        while (temp != null){
            c++;
            temp = temp.next;
        }
        System.out.println("Size of node: " + c);
    }
}


class Node2{
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
    }
}
