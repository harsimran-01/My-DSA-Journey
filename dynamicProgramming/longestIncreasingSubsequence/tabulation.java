// package dynamicProgramming.longestIncreasingSubsequence;

import java.util.HashSet;

public class tabulation {
    public static void lIS(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {50,3,10,7,40,80,80};

        lIS(arr);
    }
}
