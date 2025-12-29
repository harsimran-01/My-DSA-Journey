// package binarySearchTree.basic;

public class search {

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node searchNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return root;
        } else {
            if (key < root.data) {
                root = searchNode(root.left, key);
            } else { // key > root.data
                root = searchNode(root.right, key);
            }
        }
        return root;

    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);
        root.right = new Node(7);
        int key = 7;

        Node r = searchNode(root, key);

        if (r == null) {
            System.out.println("Key not found!");
            
        } else {
            System.out.println("Key found ,"+r.data);
            
        }

    }
}
