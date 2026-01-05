// package Heap.medium;

public class heapSort {

    public static void heapify(int i, int n,int arr[]) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        if (left < n && arr[max] < arr[left]) {
            max = left;
        }
        if (right < n && arr[max] < arr[right]) {
            max = right;
        }

        if (max != i) {
            //swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(max,n,arr);
        }
    }

    public static void heap(int arr[]) {
        //max heap build
        int n = arr.length;
        for (int i = n / 2; i >=0; i--) {
            heapify(i, n,arr);
        }
        //leargest element swap with last element

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, i,arr);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        heap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
