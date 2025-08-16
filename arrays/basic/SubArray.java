public class SubArray {

    public static void subarray(int arr[]){
        int n = arr.length;
        int tp = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
        }
        System.out.println("Total Number of Subarrays "+tp);
    }
    public static void main(String[] args) {
        int pair[] = {2,4,6,8,10};
        subarray(pair);

        
    }
}
