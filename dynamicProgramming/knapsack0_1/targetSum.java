public class targetSum {
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public static boolean targetSumCode(int val[],int sum,boolean  dp[][]) {
        int n = val.length;

        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }

        // for(int j=0;j<sum+1;j++){
        //     dp[0][j] = false;
        // }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                //include
                int v = val[i-1];
                if(v<=j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];

    }

    public static void main(String[] args) {
        int val[] = {4,2,7,1,3};
        int sum = 10;
        boolean dp[][] = new boolean[val.length + 1][sum + 1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j] = false;
        //     }
        // }
        System.out.print(targetSumCode(val,sum,dp));

    }
}
