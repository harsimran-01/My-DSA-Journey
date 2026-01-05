// package binarySearchTree.medium;

public class largestBST {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst,int size,int min,int max){
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;

        }
    }
    public static int maxBST = 0;
    public static Info isBst(Node root){

        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info lInfo = isBst(root.left);
        Info rInfo = isBst(root.right);
        int size = lInfo.size + rInfo.size + 1;
        int min = Math.min(root.data, Math.min(lInfo.min, rInfo.min));
        int max = Math.max(root.data, Math.max(lInfo.max, rInfo.max));

        if(root.data <= lInfo.max || root.data >= rInfo.min){

            return new Info(false, size, min, max);
        }

        if(lInfo.isBst && rInfo.isBst){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = isBst(root);
        System.out.println("Size "+maxBST);
    }
}
