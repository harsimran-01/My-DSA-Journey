public class prefixPrblm {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq = 1;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i= 0 ;i<word.length();i++){
            int indx = word.charAt(i) - 'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }else{
                curr.children[indx].freq++;
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }
    public static void findPrefix(Node root,String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}
