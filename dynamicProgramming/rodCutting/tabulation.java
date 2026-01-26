public class tabulation {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int rodCutting(int length[],int prices[],int totalRod,int dp[][]){
        int n = length.length;
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<totalRod+1;j++){
                int v = length[i-1];
                int p = prices[i-1];
                if(v<=j){
                    //include
                    int profit1 = p+dp[i][j-v];
                    int profit2 = dp[i-1][j];
                    dp[i][j] = Math.max(profit1, profit2);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        return dp[n][totalRod];
    }
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int prices[] = {1,5,8,9,10,17,17,20};
        int totalRod = 8;

        int dp[][] = new int[length.length + 1][totalRod + 1];
        System.out.println(rodCutting(length, prices, totalRod, dp));



    }
}
