// package dynamicProgramming.catalansNumber;

public class tabulation {

    public static int catalan_Number(int n) {
        //creation
        int dp[] = new int[n + 1];
        //initialization
        dp[0] = 1;
        dp[1] = 1;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(catalan_Number(n));
    }
}
