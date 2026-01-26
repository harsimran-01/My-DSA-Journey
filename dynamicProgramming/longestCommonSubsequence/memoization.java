// package dynamicProgramming.longestCommonSubsequence;

public class memoization {
    public static int longestSubsequence(String str1,String str2,int n,int m,int dp[][]){
        //base case -> strings length = 0
        if(n == 0 || m == 0){
            return 0;
        }

        if(dp[n][m] != -1){
            //already calculated 
            return dp[n][m];
        }
        //case 1 -> char is same in both strings
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = longestSubsequence(str1, str2, n-1, m-1,dp)+1;
        }else{
            //case 2 -> char is different in both strings
            dp[n][m] = Math.max(longestSubsequence(str1, str2, n-1, m,dp), longestSubsequence(str1, str2, n, m-1,dp));
        }

        return dp[n][m];

    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("Length of longest common subsequence : "+longestSubsequence(str1,str2,n,m,dp));
    }
}
