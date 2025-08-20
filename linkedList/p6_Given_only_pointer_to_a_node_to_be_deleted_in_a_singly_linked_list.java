package linkedList;

public class p6_Given_only_pointer_to_a_node_to_be_deleted_in_a_singly_linked_list {
    public static void main(String[] args) {
        linkedList6 linkedList = new linkedList6();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        Node6 nodeDelete = linkedList.head.next;
        linkedList.delete(nodeDelete);
        linkedList.print();
    }
}

class linkedList6 {
    Node6 head, tail;

    public void insert(int data){
        Node6 n1 = new Node6(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void delete(Node6 node) {
        if (node == null || node.next == null) {
            System.out.println("Can't delete last node");
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void print() {
        Node6 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Node6 {
    int data;
    Node6 next;

    public Node6(int data) {
        this.data = data;
    }
}
