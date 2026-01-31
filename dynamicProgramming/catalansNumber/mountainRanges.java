// package dynamicProgramming.catalansNumber;

public class mountainRanges {
    public static int count_Ranges(int pair){
        int dp[] = new int[pair+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<pair+1;i++){
            for(int j=0;j<i;j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside*outside;
            }
        }
        return dp[pair];
    }
    public static void main(String[] args) {
        int pair = 4;
        System.out.println(count_Ranges(pair));
    }
}
