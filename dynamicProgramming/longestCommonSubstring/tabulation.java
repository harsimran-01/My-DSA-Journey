// package dynamicProgramming.longestCommonSubstring;

public class tabulation {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int longestSubstring(String s1,String s2,int n,int m,int dp[][]){
        //step 2 -> initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0; //column 
        }
        for(int j =0;j<dp[0].length;j++){
            dp[0][j] = 0; //row
        }
        int ans = 0;

        //step 3 -> start filling bottom-up 
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //same
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }
                //different
                else{
                    dp[i][j] = 0;
                }
            }
        }
        print(dp);
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABGCE";
        int n = s1.length();
        int m = s2.length();
        //step 1 -> 2D array
        int dp[][] = new int[n+1][m+1];
        System.out.println(longestSubstring(s1,s2,n,m,dp));
    }
}
