// package dynamicProgramming.editDistance;

public class stringConversion {
    //only remove and delete operation allowed
    public static int string_Conversion(String str1,String str2){
        int n = str1.length();
        int m = str2.length();

        //step 1
        int dp[][] = new int[n+1][m+1];
        //step2
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }
        //step3
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //same
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                //different
                else{
                    dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j])+1;
                }
            }
        }
        return dp[n][m];

    }
    public static void main(String[] args) {
        // String str1 = "pear";
        String str1 = "kitten";
        // String str2 = "sea";
        String str2 = "sitting";

        System.out.println(string_Conversion(str1, str2));
    }
}
