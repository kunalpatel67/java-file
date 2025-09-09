package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class p7_Create_binary_tree_from_an_array_with_level_order {
    public static void main(String[] args) {
        binaryTree7 binaryTree = new binaryTree7();
        int[] arr = {10,20,30,40,50,60,70};
        binaryTree.root = new Node7(arr[0]);
        binaryTree.convertArrayToBinaryTree(arr,binaryTree.root);
        binaryTree.levelOrder(binaryTree.root);
    }
}

class binaryTree7 {
    Node7 root;

    public void convertArrayToBinaryTree(int[] arr,Node7 root) {
        Queue<Node7> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length){
            Node7 nn = queue.poll();

            if (i < arr.length){
                nn.left = new Node7(arr[i]);
                queue.add(nn.left);
                i++;
            }
            if (i < arr.length){
                nn.right = new Node7(arr[i]);
                queue.add(nn.right);
                i++;
            }
        }
    }

    public void levelOrder(Node7 root){
        Queue<Node7> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node7 nn = queue.poll();
            System.out.print(nn.data + " ");

            if (nn.left != null){
                queue.add(nn.left);
            }
            if (nn.right != null){
                queue.add(nn.right);
            }
        }
    }
}

class Node7 {
    int data;
    Node7 left,right;

    public Node7(int data) {
        this.data = data;
    }
}