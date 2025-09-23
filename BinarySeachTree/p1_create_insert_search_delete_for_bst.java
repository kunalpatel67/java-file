package BinarySeachTree;

public class p1_create_insert_search_delete_for_bst {
    public static void main(String[] args) {
        bst bst = new bst();
        bst.insert(5);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(9);

        bst.inOrder(bst.root);
        System.out.println();
        if (bst.search(bst.root,2)){
            System.out.println("present");
        }
        else {
            System.out.println("Not present");
        }
        bst.delete(5);
        bst.inOrder(bst.root);
    }
}

class bst {
    node root;
    public void insert(int val){
        root = insert(root,val);
    }
    private node insert(node root,int val){
        if (root == null){
            root = new node(val);
            return root;
        }
        if (val < root.data){
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    public void inOrder(node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public boolean search(node root,int val){
        if (root == null){
            return false;
        }
        if (root.data == val){
            return true;
        }
        if (val < root.data){
            return search(root.left,val);
        }
        return search(root.right,val);
    }

    public void delete(int val) {
        root = delete(root,val);
    }
    private node delete(node root, int val){
        if (root == null){
            return root;
        }
        if (val > root.data){
            root.right = delete(root.right,val);
        }
        else if (val < root.data){
            root.left = delete(root.left,val);
        }
        else {
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            root.data = minVal(root.right);
            root.right = delete(root.right,root.data);
        }
        return root;
    }
    private int minVal(node n){
        int min = n.data;
        while (n.left != null){
            min = n.left.data;
        }
        return min;
    }
}

class node {
    int data;
    node left,right;

    public node(int data) {
        this.data = data;
    }
}