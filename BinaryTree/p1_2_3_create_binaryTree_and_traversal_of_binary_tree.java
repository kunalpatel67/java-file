package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
/*                  10
              20          30
          40     50   60      70

*/


public class p1_2_3_create_binaryTree_and_traversal_of_binary_tree {
    public static void main(String[] args) {
        binaryTree binaryTree = new binaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.left = new Node(20);
        binaryTree.root.right = new Node(30);
        binaryTree.root.left.left = new Node(40);
        binaryTree.root.left.right = new Node(50);
        binaryTree.root.right.left = new Node(60);
        binaryTree.root.right.right = new Node(70);
        System.out.println("Level-Order:-");
        binaryTree.levelOrder();
        System.out.println();
        System.out.println("Pre-Order:-");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.println("Post-Order:-");
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        System.out.println("In-Order:-");
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
    }
}
class binaryTree {
    Node root;

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node n = queue.poll();
            System.out.print(n.data + " ");
            if (n.left != null){
                queue.add(n.left);
            }
            if (n.right != null){
                queue.add(n.right);
            }
        }
    }

    public void preOrder(Node root) {
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void inOrder(Node root) {
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}

class Node {
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
    }
}