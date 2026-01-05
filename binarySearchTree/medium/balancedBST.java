
import java.util.ArrayList;

// package binarySearchTree.medium;

public class balancedBST {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createBal(ArrayList<Integer> inorder,int st,int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBal(inorder, 0, mid-1);
        root.right = createBal(inorder, mid+1,end);
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
    public static Node balBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);


        root = createBal(inorder, 0, inorder.size()-1);
        return root;

    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        balBST(root);
        inorder(root);
    }
}
