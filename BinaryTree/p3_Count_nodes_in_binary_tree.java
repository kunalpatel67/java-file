package BinaryTree;

public class p3_Count_nodes_in_binary_tree {
    public static void main(String[] args) {
        binaryTree1 binaryTree = new binaryTree1();
        binaryTree.root = new Node1(10);
        binaryTree.root.left = new Node1(20);
        binaryTree.root.right = new Node1(30);
        binaryTree.root.left.left = new Node1(40);
        binaryTree.root.left.right = new Node1(50);
        binaryTree.root.right.left = new Node1(60);
        binaryTree.root.right.right = new Node1(70);
        System.out.println(binaryTree.size(binaryTree.root));
        binaryTree.root.left.left.left = new Node1(80);
        System.out.println(binaryTree.size(binaryTree.root));
    }
}

class binaryTree1 {
    Node1 root;

    public int size(Node1 root) {
        if (root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
}

class Node1 {
    int data;
    Node1 left,right;

    public Node1(int data) {
        this.data = data;
    }
}