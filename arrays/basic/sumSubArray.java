public class sumSubArray {
    public static void sumarray(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println("Sum of SubArray "+sum);
                System.out.println();
            }
        }
    }

    public static void totalsumarray(int arr[]){
        int sum = 0;
        int n = arr.length;
        int totalSum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                totalSum+=sum;
                System.out.println();
            }
        }
        System.out.println("Total sum "+totalSum);
    }
    public static void main(String[] args) {
        int pair[] = {2,4,6,8,10};
        sumarray(pair);
        totalsumarray(pair);
    }
}
