package BinaryTree;

public class p4_Find_n_th_node_of_inorder_traversal {
    public static void main(String[] args) {
        binaryTree2 binaryTree = new binaryTree2();
        binaryTree.root = new Node2(10);
        binaryTree.root.left = new Node2(20);
        binaryTree.root.right = new Node2(30);
        binaryTree.root.left.left = new Node2(40);
        binaryTree.root.left.right = new Node2(50);
        binaryTree.root.right.left = new Node2(60);
        binaryTree.root.right.right = new Node2(70);
        binaryTree.printNthNodeOfInOrder(binaryTree.root,2);
    }
}

class binaryTree2 {
    Node2 root;
    int count = 0;

    public void printNthNodeOfInOrder(Node2 root,int nth) {
        if (root == null){
            return;
        }
        printNthNodeOfInOrder(root.left,nth);
        count++;
        if (count == nth){
            System.out.println(nth + ": " + root.data);
        }
        printNthNodeOfInOrder(root.right,nth);
    }
}

class Node2 {
    int data;
    Node2 left,right;

    public Node2(int data) {
        this.data = data;
    }
}