// package binarySearchTree.basic;

public class validateBST {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isValid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){

            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);

    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);
        root.right = new Node(7);
        root.right.right = new Node(8);

        if(isValid(root, null, null)){
            System.out.println("Is valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
