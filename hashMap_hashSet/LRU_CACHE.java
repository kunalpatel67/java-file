package hashMap_hashSet;

import java.util.HashMap;

public class LRU_CACHE {
    static int size = 3;
    public static void main(String[] args) {
        lruCache lru = new lruCache();
        lru.add(10);
        lru.add(20);
        lru.add(30);
        lru.print();

        lru.search(10);
        lru.print();

        lru.add(40);
        lru.print();

        lru.search(30);
        lru.print();
    }
}

class lruCache {

    HashMap<Integer,Node1> hashMap = new HashMap<>();
    doublyLinkedList doublyLL = new doublyLinkedList();

    public void add(int v) {
        if (hashMap.containsKey(v)){
            Node1 node = hashMap.get(v);
            doublyLL.deleteByP(node);
            doublyLL.insertLast(node);
        }
        else {
            if (hashMap.size() == LRU_CACHE.size){
                Node1 lru = doublyLL.deleteFirst();
                hashMap.remove(lru.data);
            }
            Node1 nn = new Node1(v);
            doublyLL.insertLast(nn);
            hashMap.put(v,nn);
        }
    }

    public void search(int v) {
        if (!hashMap.containsKey(v)){
            System.out.println(v + "not found");
            return;
        }
        Node1 node = hashMap.get(v);
        doublyLL.deleteByP(node);
        doublyLL.insertLast(node);
    }

    public void print() {
        doublyLL.print();
        System.out.println();
    }

}

class doublyLinkedList {
    Node1 head, tail;

    public void insertLast(Node1 node) {
        if (head == null){
            head = tail = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public Node1 deleteFirst() {
        if (head == null) {
            return null;
        }

        Node1 temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        temp.next = null;
        return temp;
    }

    public void deleteByP(Node1 node) {
        if (node == null) {
            return;
        }

        if (node == head) {
            deleteFirst();
            return;
        }

        if (node == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            return;
        }

        Node1 prevNode = node.prev;
        Node1 nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        node.next = null;
        node.prev = null;
    }

    public void print() {
        Node1 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node1 {
    int data;
    Node1 next, prev;

    public Node1(int data) {
        this.data = data;
    }
}
