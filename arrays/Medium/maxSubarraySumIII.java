public class maxSubarraySumIII {

    public static void kadanesAlgo(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            // cs = cs+arr[i];
            // if(cs<0){
            //     cs = 0;
            // }
            cs = Math.max(arr[i], cs+arr[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-6,-1,-3};
        kadanesAlgo(arr);
    }
}
