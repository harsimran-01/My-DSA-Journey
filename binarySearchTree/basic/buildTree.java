// package binarySearchTree.basic;

public class buildTree {

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node build(int val, Node root) {
        Node newNode = new Node(val);
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = build(val, root.left);
        } else {
            root.right = build(val, root.right);
        }
        return root;

    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};

        Node root = null;
        for(int i=0;i<values.length;i++){
            root = build(values[i], root);
        }
        inOrder(root);
    }
}
