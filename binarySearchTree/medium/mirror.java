// package binarySearchTree.medium;

public class mirror {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node lefts = mirror(root.left);
        Node rights = mirror(root.right);

        root.left = rights;
        root.right = lefts;
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);
        root.right = new Node(7);
        root.right.right = new Node(8);

        inorder(root);
        System.out.println("mirror");
        mirror(root);
        inorder(root);

    }
}
