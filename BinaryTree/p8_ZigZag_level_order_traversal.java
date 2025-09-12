package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class p8_ZigZag_level_order_traversal {
    public static void main(String[] args) {
        binaryTree8 binaryTree = new binaryTree8();
        binaryTree.root = new Node8(10);
        binaryTree.root.left = new Node8(20);
        binaryTree.root.right = new Node8(30);
        binaryTree.root.left.left = new Node8(40);
        binaryTree.root.left.right = new Node8(50);
        binaryTree.root.right.left = new Node8(60);
        binaryTree.root.right.right = new Node8(70);
        binaryTree.zigZagLevelOrder(binaryTree.root);
    }
}

class binaryTree8 {
    Node8 root;

    public void zigZagLevelOrder(Node8 root) {
        Deque<Node8> deque = new LinkedList<>();
        deque.addFirst(root);
        boolean flag = true;

        while (!deque.isEmpty()){
            int size = deque.size();
            if (flag == true){
                while (size > 0){
                    Node8 nn = deque.pollFirst();
                    System.out.print(nn.data + " ");
                    if (nn.left != null){
                        deque.addLast(nn.left);
                    }
                    if (nn.right != null){
                        deque.addLast(nn.right);
                    }
                    size--;
                }
                flag = false;
            }
            else {
                while (size > 0){
                    Node8 nn = deque.pollLast();
                    System.out.print(nn.data + " ");
                    if (nn.right != null){
                        deque.addFirst(nn.right);
                    }
                    if (nn.left != null){
                        deque.addFirst(nn.left);
                    }
                    size--;
                }
                flag = true;
            }
        }
    }
}

class Node8 {
    int data;
    Node8 left,right;

    public Node8(int data) {
        this.data = data;
    }
}
