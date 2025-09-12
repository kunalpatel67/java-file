package BinaryTree;

import java.util.Stack;

public class p9_10_11_preOrder_postOrder_inOrder_without_recursion {
    public static void main(String[] args) {
        binaryTree9 binaryTree = new binaryTree9();
        binaryTree.root = new Node9(10);
        binaryTree.root.left = new Node9(20);
        binaryTree.root.right = new Node9(30);
        binaryTree.root.left.left = new Node9(40);
        binaryTree.root.left.right = new Node9(50);
        binaryTree.root.right.left = new Node9(60);
        binaryTree.root.right.right = new Node9(70);
        System.out.println("Pre-Order:- ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.println("Post-Order:- ");
        binaryTree.postOder(binaryTree.root);
        System.out.println();
        System.out.println("In-Order:- ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
    }
}

class binaryTree9 {
    Node9 root;

    public void preOrder(Node9 root){
        Stack<Node9> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){
            Node9 nn = stack.pop();
            System.out.print(nn.data + " ");

            if (nn.right != null){
                stack.add(nn.right);
            }
            if (nn.left != null){
                stack.add(nn.left);
            }
        }
    }

    public void postOder(Node9 root){
        Stack<Node9> stack1 = new Stack<>();
        Stack<Node9> stack2 = new Stack<>();

        stack1.push(root);
        while (!stack1.isEmpty()){
            Node9 nn = stack1.pop();
            stack2.push(nn);

            if (nn.left != null){
                stack1.push(nn.left);
            }
            if (nn.right != null){
                stack1.push(nn.right);
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().data + " ");
        }
    }

    public void inOrder(Node9 root) {
        Stack<Node9> stack = new Stack<>();
        Node9 curr = root;
        while (!stack.isEmpty() || curr != null){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}

class Node9 {
    int data;
    Node9 left,right;

    public Node9(int data) {
        this.data = data;
    }
}