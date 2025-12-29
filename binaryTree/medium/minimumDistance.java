public class minimumDistance {
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
    public static Node lca(Node root,int n1,int n2){
        if(root == null){
            return root;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if(right == null) return left;

        if(left == null) return right;

        return root;
    }

    public static int lcaDist(Node lca,int n){
        if(lca == null){
            return -1;
        }

        if(lca.data == n){
            return 0;
        }

        int left = lcaDist(lca.left, n);
        int right = lcaDist(lca.right, n);

        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right+1;
        }else{
            return left+1;
        }
    }
    public static int minDis(Node root,int n1,int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4,n2 = 7;

        System.out.println(minDis(root, n1, n2));
    }
}
