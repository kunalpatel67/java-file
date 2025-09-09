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
        if (root == null) return;

        Queue<Node8> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node8 node = queue.poll();
                level.add(node.data);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            if (leftToRight == false) {
                Collections.reverse(level);
            }

            for (int val : level) {
                System.out.print(val + " ");
            }

            if (leftToRight == true){
                leftToRight = false;
            }
            else {
                leftToRight = true;
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