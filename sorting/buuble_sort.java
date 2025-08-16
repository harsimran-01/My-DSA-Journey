// package sorting;

public class buuble_sort {

    public static void bubbleSortLargest(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

    }
    public static void bubbleSortSmallest(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.println("Sorting in Ascending Order");
        bubbleSortLargest(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorting in Descending Order");
        bubbleSortSmallest(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
