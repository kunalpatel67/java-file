package linkedList.SinglyLinkedList;

public class p9_Find_length_of_loop_in_linked_list {
    public static void main(String[] args) {
        linkedList9 linkedList = new linkedList9();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.head.next.next.next.next.next = linkedList.head.next.next;
        System.out.println(linkedList.LengthOfLoop());
    }
}

class linkedList9 {
    Node9 head, tail;

    public void insert(int data){
        Node9 n1 = new Node9(data);
        if (head == null){
            head = tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
    }

    public int LengthOfLoop() {
        Node9 slow = head;
        Node9 fast = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                int count = 1;
                Node9 temp = slow.next;
                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }
}

class Node9 {
    int data;
    Node9 next;

    public Node9(int data) {
        this.data = data;
    }
}
