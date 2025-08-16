// package sorting;

public class selection_sort {

    public static void selectionSortLargest(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
    public static void selectionSortSmallest(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int max = i;
            for(int j=i+1;j<n;j++){
                if(arr[max] < arr[j]) max = j;
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.println("Sorting in Ascending Order");
        selectionSortLargest(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorting in Descending Order");
        selectionSortSmallest(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
