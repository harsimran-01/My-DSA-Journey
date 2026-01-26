// package dynamicProgramming.longestCommonSubsequence;

public class tabulation {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int longestSubsequence(String str1,String str2,int n,int m, int dp[][]){
        //initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //same
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    //diff
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        System.out.println("Length of longest common subsequence : "+longestSubsequence(str1,str2,n,m,dp));

    }
}
