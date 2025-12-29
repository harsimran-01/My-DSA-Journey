// package binaryTree.basic;

public class subTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null ||root.data != subRoot.data){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)) return false;
        if(!isIdentical(root.right, subRoot.right)) return false;

        return true;
    }
    public static boolean subTree(Node root,Node subRoot){
        if(root == null) return false;
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        // boolean leftans = subTree(root.left, subRoot);
        // boolean rightans = subTree(root.right, subRoot);

        // return leftans || rightans;

        return subTree(root.left, subRoot) || subTree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        Node subRoot = new Node(2);
        subRoot.left = new Node(5);
        subRoot.right = new Node(5);

        System.out.println(subTree(root, subRoot) + " ");
    }
}
