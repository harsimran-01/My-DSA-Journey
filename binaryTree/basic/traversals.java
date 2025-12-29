
import java.util.LinkedList;
import java.util.Queue;

// package binaryTree.basic;

public class traversals {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class buildingTraversals{
        static int indx = -1;

        public static Node buildtree(int node[]) {
            indx++;
            if (node[indx] == -1) {
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);

            return newNode;
        }

        //preorder traversals
        public static void preOrder(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

        //inorder traversals
        public static void inOrder(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }

        //postOrder traversals
        public static void postOrder(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curNode = q.remove();
                if(curNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curNode.data + " ");
                    if(curNode.left != null){
                        q.add(curNode.left);
                    }
                    if(curNode.right != null){
                        q.add(curNode.right);
                    }
                }
            }
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            int height = Math.max(rh, lh) + 1;

            return height;
        }
        public static int diameter(Node root){ //O(n)
            if(root == null){
                return 0;
            }

            int ldiam = diameter(root.left);
            int rdiam = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int rootDiam = lh + rh + 1;
            // int ans = Math.max(ldiam, rdiam);
            // return Math.max(ans, rootDiam);
            return Math.max(rootDiam, Math.max(ldiam, rdiam));
        }


        static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter2(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht+1);

            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(diam, ht);

        }



        public static int countNode(Node root){
            if(root == null){
                return 0;
            }

            int lc = countNode(root.left);
            int rc = countNode(root.right);

            int count = lc+rc+ 1;

            return count;
        }
        public static int sumNode(Node root){
            if(root == null){
                return 0;
            }

            int lc = sumNode(root.left);
            int rc = sumNode(root.right);

            int count = lc+rc+ root.data;

            return count;
        }

    }
    public static void main(String[] args) {
        buildingTraversals tree = new buildingTraversals();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1};
        Node root = tree.buildtree(nodes);
        System.out.println("PreOrder Traversal");
        tree.preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        tree.inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        tree.postOrder(root);
        System.out.println();
        System.out.println("LevelOrder Traversal");
        tree.levelOrder(root);
        System.out.println();
        System.out.println("height of tree");
        System.out.println(tree.height(root));
        System.out.println();
        System.out.println("Count of nodes of tree");
        System.out.println(tree.countNode(root));
        System.out.println();
        System.out.println("Sum of nodes of tree");
        System.out.println(tree.sumNode(root));
        System.out.println();
        System.out.println("Diameter of tree");
        System.out.println(tree.diameter(root));
        System.out.println();
        System.out.println("Diameter of tree");
        System.out.println(tree.diameter2(root).diam);
    }
}
