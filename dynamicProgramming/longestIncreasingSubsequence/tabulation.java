// package dynamicProgramming.longestIncreasingSubsequence;

import java.util.Arrays;
import java.util.HashSet;

public class tabulation {
    public static int lcs(int arr[],int arr2[]){
        int n = arr.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //same
                if(arr[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                //different
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        
        return dp[n][m];
    } 
    public static int lIS(int arr[]){

        //step 1 -> creating unique elements
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        //step2 -> creating new array with unique + sorted elements
        int arr2[] = new int[set.size()];
        int indx = 0;
        for (int i : set) {
            arr2[indx] = i;
            indx++;
        }

        Arrays.sort(arr2);
        return lcs(arr,arr2);
    }
    public static void main(String[] args) {
        int arr[] = {50,3,10,7,40,80,80};

        System.out.println(lIS(arr));
    }
}
