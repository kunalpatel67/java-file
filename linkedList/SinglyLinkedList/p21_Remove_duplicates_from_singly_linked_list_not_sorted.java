package linkedList.SinglyLinkedList;

public class p21_Remove_duplicates_from_singly_linked_list_not_sorted {
    public static void main(String[] args) {
        linkedList21 linkedList = new linkedList21();
        linkedList.insert(10);
        linkedList.insert(5);
        linkedList.insert(20);
        linkedList.insert(200);
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(100);
        linkedList.insert(2);
        linkedList.insert(2);
        linkedList.insert(10);
        linkedList.insert(10);

        linkedList.print();
        linkedList.removeDuplicates();
        linkedList.print();
    }
}

class linkedList21 {
    Node21 head, tail;

    public void insert(int data){
        Node21 n1 = new Node21(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public void removeDuplicates() {
        Node21 curr = head;
        while (curr != null && curr.next != null){
            Node21 temp = curr.next;
            Node21 prev = curr;
            while (temp != null){
                if (temp.data == curr.data){
                    prev.next = temp.next;
                    temp = temp.next;
                }
                else {
                    prev = temp;
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
    }

    public int size(){
        int count = 0;
        Node21 temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void print() {
        Node21 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node21 {
    int data;
    Node21 next;

    public Node21(int data) {
        this.data = data;
    }
}
