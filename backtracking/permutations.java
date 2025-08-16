
public class permutations {
    public static void perm(String str, String newStr){
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String ans = str.substring(0,i)+str.substring(i+1);
            perm(ans, newStr+curr);

        }
    }
    public static void main(String[] args) {
        perm("abc", "");
    }
}
