public class reverse_array {
    public static void reverse(int arr[]){ //o(n) and space complexity = o(1)
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        display(arr);
        System.out.println();
        System.out.println("Reversing the Array");
        reverse(arr);
        display(arr);
        
    }
}
