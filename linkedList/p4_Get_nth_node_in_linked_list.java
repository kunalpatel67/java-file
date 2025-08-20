package linkedList;

public class p4_Get_nth_node_in_linked_list {
    public static void main(String[] args) {
        linkedList4 linkedList = new linkedList4();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.printNthNode(1);
    }
}

class linkedList4{
    Node4 head, tail;

    public void insert(int data){
        Node4 n1 = new Node4(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    // print nth node
    public void printNthNode(int nth) {
        Node4 temp = head;
        int c = 0;
        while (temp != null){
            c++;
            if (c == nth){
                System.out.println(nth + "th Node: " + temp.data);
                return;
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node4{
    int data;
    Node4 next;

    public Node4(int data) {
        this.data = data;
    }
}