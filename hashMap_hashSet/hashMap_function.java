package hashMap_hashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class hashMap_function {
    public static void main(String[] args) {
        hashmap2 hashmap = new hashmap2();
        hashmap.put(101,"kunal");
        hashmap.put(102,"parth");
        hashmap.put(102,"jay");

        hashmap.get(102);
    }
}

class hashmap2 {
    ArrayList<linkedList> linkedList = new ArrayList<>();

    hashmap2(){
        for (int i=0; i<16; i++){
            linkedList.add(new linkedList());
        }
    }

    public void put(int k, String v) {
        int hash = Objects.hashCode(k);
        int index = hash % 16;

        Node nn = new Node(k, v, hash);
        linkedList bucket = linkedList.get(index);

        Node current = bucket.head;
        while (current != null) {
            if (current.key == k) {
                current.value = v;
                return;
            }
            current = current.next;
        }

        bucket.insert(nn);
    }

    public void get(int k) {
        int hash = Objects.hashCode(k);
        int index = hash % 16;

        linkedList bucket = linkedList.get(index);
        Node current = bucket.head;

        while (current != null) {
            if (current.key == k) {
                System.out.println(current.value);
                return;
            }
            current = current.next;
        }
        System.out.println("Key not found");
    }
}

class linkedList {
    Node head, tail;

    public void insert(Node nn) {
        if (head == null) {
            head = tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
    }
}


class Node {
    int key;
    String value;
    int hashCode;
    Node next;

    public Node(int k, String v, int hash) {
        this.key = k;
        this.value = v;
        this.hashCode = hash;
    }
}