// package dynamicProgramming.longestCommonSubsequence;

public class recursion {
    public static int longestSubsequence(String str1,String str2,int n,int m){
        //base case -> strings length = 0
        if(n == 0 || m == 0){
            return 0;
        }

        //case 1 -> char is same in both strings
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return longestSubsequence(str1, str2, n-1, m-1)+1;
        }else{
            //case 2 -> char is different in both strings
            int ans1 = longestSubsequence(str1, str2, n-1, m);
            int ans2 = longestSubsequence(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }

    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        
        System.out.println("Length of longest common subsequence : "+longestSubsequence(str1,str2,n,m));
    }
}
