
import java.util.Arrays;

// package dynamicProgramming.catalansNumber;

public class memoization {
    public static int catalan_Number(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += catalan_Number(i,dp) * catalan_Number(n-i-1,dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        // for(int i=0;i<dp.length;i++){
        //     dp[i] = -1;
        // }
        Arrays.fill(dp, -1);
        System.out.println(catalan_Number(4,dp));
    }
}
