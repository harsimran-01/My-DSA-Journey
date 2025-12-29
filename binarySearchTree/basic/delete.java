// package binarySearchTree.basic;

public class delete {

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node delNode(Node root, int val) {
        if (root.data > val) {
            root.left = delNode(root.left, val);
        } else if (root.data < val) {
            root.right = delNode(root.right, val);
        } else {//voila case

            //case 1 -> leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            //case 2 -> single child (replace with child node)
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 -> two child 
            //find inorder successor
            Node inSuccessor = inorderSuccessor(root.right);
            //replace the value with inorder successor
            root.data = inSuccessor.data;
            //delete the inorder successor
            root.right = delNode(root.right, inSuccessor.data);

        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
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
        Node root = new Node(5);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);
        root.right = new Node(7);
        root.right.right = new Node(8);

        inOrder(root);

        System.out.println();
        System.out.println("After deletion");
        delNode(root, 5);

        inOrder(root);

        
    }
}
