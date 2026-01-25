// package dynamicProgramming.coinChange;

public class tabulation {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public static int coinCount(int coin[],int sum,int dp[][]) {
        int n = coin.length;
        for (int i = 0; i < n+1; i++) { //0th col
            dp[i][0] = 1;
        }
        for (int j = 0; j < sum+1; j++) {//0th row
            dp[0][j] = 0;
        }

        //initialization
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = coin[i-1];
                if (v <= j) { //valid
                    dp[i][j] = dp[i][j-v]+dp[i-1][j];
                    
                } else {
                    dp[i][j] = dp[i - 1][j];
                
                }
            }
        }
        //printing
        print(dp);
        return dp[n][sum];

    }
    public static void main(String[] args) {
        // int coin[] = {1,2,3};
        int coin[] = {2,5,3,6};
        // int sum = 4;
        int sum = 10;
        int dp[][] = new int[coin.length + 1][sum + 1];
        System.out.print(coinCount(coin,sum,dp));
    }
}
