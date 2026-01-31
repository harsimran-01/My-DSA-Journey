// package dynamicProgramming.minimumPartioning;

public class tabulation {
    public static int minPartition(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int W = sum/2;
        int dp[][] = new int[n+1][W+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int wt = nums[i-1];
                if(wt<=j){
                    //valid
                    //include
                    int ans1 = nums[i-1]+dp[i-1][j-wt];
                    //exclude
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    //invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        int nums[] = {1,6,11,5};
        System.out.println(minPartition(nums));

    }
}
