// package Trie;

public class wordBreak {

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

    public static boolean wordbreak(String key){
        if(key.length() == 0) return true;

        for(int i=1;i<=key.length();i++){

            if(search(key.substring(0, i)) && 
            wordbreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[] = {"i","like","sam","samsung","mobile"};

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordbreak(key));
    }
}
