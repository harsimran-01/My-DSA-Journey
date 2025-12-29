// package binarySearchTree.basic;
import java.util.*;
public class rootPath {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printAns(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    public static void printPath(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printAns(path);
        }

        
        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size()-1);
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
        printPath(root,new ArrayList<>());
    }
}
