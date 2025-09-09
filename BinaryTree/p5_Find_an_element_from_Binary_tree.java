package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class p5_Find_an_element_from_Binary_tree {
    public static void main(String[] args) {
        binaryTree3 binaryTree = new binaryTree3();
        binaryTree.root = new Node3(10);
        binaryTree.root.left = new Node3(20);
        binaryTree.root.right = new Node3(30);
        binaryTree.root.left.left = new Node3(40);
        binaryTree.root.left.right = new Node3(50);
        binaryTree.root.right.left = new Node3(60);
        binaryTree.root.right.right = new Node3(70);
        boolean ans = binaryTree.findElement(binaryTree.root,70);
        System.out.println(ans);
    }
}

class binaryTree3 {
    Node3 root;

    public boolean findElement(Node3 root,int element) {
        if (root == null){
            return false;
        }
        if (root.data == element){
            return true;
        }
        return findElement(root.left, element) || findElement(root.right,element);
    }
}

class Node3 {
    int data;
    Node3 left, right;

    public Node3(int data) {
        this.data = data;
    }
}