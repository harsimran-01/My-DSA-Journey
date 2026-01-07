// package Trie;

public class insert {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i = 0 ;i<word.length();i++){
            int indx = word.charAt(i) - 'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }
    public static void main(String[] args) {
        String word[] = {"the","a","there","their","any","thee"};

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
    }
}
