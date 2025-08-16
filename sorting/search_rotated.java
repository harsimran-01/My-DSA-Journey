public class search_rotated {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return  -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid] == target){
            return mid;
        }
        
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                return search(arr, target, mid+1, ei);
            }

        }else{
            if(arr[mid]<=target && target <=arr[ei]){
                return search(arr, target, mid+1, ei);

            }else{
                return search(arr, target, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target,0,arr.length-1));
        

    }
}
