
public class tabulation {

    public static int knapsack(int val[], int wt[], int indx, int W, int dp[][]) {
        int n = val.length;
        for (int i = 0; i < dp.length; i++) { //0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {//0th row
            dp[0][j] = 0;
        }

        //initialization
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) { //valid
                    //case 1
                    int profit1 = v + dp[i - 1][j - w];
                    //case 2
                    int profit2 = dp[i - 1][j];
                    dp[i][j] = Math.max(profit1, profit2);
                    
                } else {
                    dp[i][j] = dp[i - 1][j];
                
                }
            }
        }
        return dp[n][W];

    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.print(knapsack(val, wt, val.length, W, dp));

    }
}
