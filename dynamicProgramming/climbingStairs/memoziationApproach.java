// package dynamicProgramming.climbingStairs;

public class memoziationApproach {
    public static int countWays(int n,int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = countWays(n-1,dp)+countWays(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(countWays(n,dp));
    }
}
