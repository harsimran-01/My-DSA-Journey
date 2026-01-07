
public class longestWord {

    static class Node {

        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.eow == true;
    }
    public static String ans = "";

    public static void lWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                lWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String word[] = {"a", "banana", "app", "appl", "ap", "apply"};

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        lWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
