// package binarySearchTree.basic;

public class printInRange {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void print(Node root,int n1,int n2){
        if(root == null){
            return;
        }
        if(root.data >= n1 && root.data <= n2){
            print(root.left, n1, n2);
            System.out.print(root.data + " ");
            print(root.right, n1, n2);
        }else if(root.data < n1){
            print(root.left, n1, n2);
        }else{
            print(root.right, n1, n2);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);
        root.right = new Node(7);
        root.right.right = new Node(8);

        print(root, 3, 7);
    }
}
