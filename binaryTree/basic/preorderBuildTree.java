
public class preorderBuildTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class buildTree {

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
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, -1, -1, 3, -1, 6, -1, -1};
        buildTree t = new buildTree();
        Node root = t.buildtree(nodes);
        System.out.println(root.data);
    }
}
