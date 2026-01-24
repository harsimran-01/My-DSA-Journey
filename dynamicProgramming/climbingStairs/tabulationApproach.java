
public class tabulationApproach {

    public static int countWays(int n, int dp[]) {
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;//i < 0 => 0
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        System.out.print(countWays(n, dp) + " ");
    }
}
