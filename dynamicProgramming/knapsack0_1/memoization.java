// package knapsack0_1;

public class memoization {

    public static int knapsack(int val[], int wt[], int indx, int W, int dp[][]) {
        if (W == 0 || indx == 0) {
            return 0;
        }
        if (dp[indx][W] != -1) {
            return dp[indx][W];
        }
        if (wt[indx - 1] <= W) {
            //include
            int ans1 = val[indx - 1] + knapsack(val, wt, indx - 1, W - wt[indx - 1], dp);
            //exclude
            int ans2 = knapsack(val, wt, indx - 1, W, dp);

            dp[indx][W] = Math.max(ans1, ans2);
            return dp[indx][W];
        } else {
            //exclude
            dp[indx][W] = knapsack(val, wt, indx - 1, W, dp);
            return dp[indx][W];

        }

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
