

public class maxSubarraySumII {
    

    //PREFIX APPROACH

    public static void maxSum(int arr[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currSum = start == 0?prefix[end] : prefix[end]-prefix[start-1];
            }
            if(maxsum<currSum){
                maxsum = currSum;
            }
        }
        System.out.println("Maximum sum "+maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSum(arr);
    }
}
