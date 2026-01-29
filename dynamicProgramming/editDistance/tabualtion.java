// package dynamicProgramming.editDistance;

public class tabualtion {
    public static int edit_Distance(String word1,String word2,int n,int m){
        int dp[][] = new int[n+1][m+1];

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
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        int n = word1.length();
        int m = word2.length();
        System.out.println(edit_Distance(word1,word2,n,m));
    }
}
