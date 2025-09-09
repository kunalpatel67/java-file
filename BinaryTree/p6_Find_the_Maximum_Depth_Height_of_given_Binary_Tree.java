package BinaryTree;

public class p6_Find_the_Maximum_Depth_Height_of_given_Binary_Tree {
    public static void main(String[] args) {
        binaryTree6 binaryTree = new binaryTree6();
        binaryTree.root = new Node6(10);
        binaryTree.root.left = new Node6(20);
        binaryTree.root.right = new Node6(30);
        binaryTree.root.left.left = new Node6(40);
        binaryTree.root.left.right = new Node6(50);
        binaryTree.root.right.left = new Node6(60);
        binaryTree.root.right.right = new Node6(70);
        binaryTree.root.right.right.right = new Node6(70);
        System.out.println(binaryTree.maxDepth(binaryTree.root));
    }
}

class binaryTree6 {
    Node6 root;

    public int maxDepth(Node6 root) {
        if (root == null){
            return 0;
        }
        int leftD = maxDepth(root.left);
        int rightD = maxDepth(root.right);

        return 1 + Math.max(leftD,rightD);
    }
}

class Node6 {
    int data;
    Node6 left,right;

    public Node6(int data) {
        this.data = data;
    }
}