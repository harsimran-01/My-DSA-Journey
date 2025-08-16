// package sorting;

public class counting_sort {
    public static void countingSortLargest(int arr[]){
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count[] = new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }


    }
    // public static void countingSortSmallest(int arr[]){
    //     int n = arr.length;
    //     int min = 0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i] < min){
    //             min = arr[i];
    //         }
    //     }

    //     int count[] = new int[min+1];
    //     for(int i=0;i<n;i++){
    //         count[arr[i]]++;
    //     }
    //     int j = 0;
    //     for(int i=0;i<count.length;i++){
    //         while(count[i]>0){
    //             arr[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }

    // }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.println("Sorting in Ascending Order");
        countingSortLargest(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorting in Descending Order");
        // countingSortSmallest(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
