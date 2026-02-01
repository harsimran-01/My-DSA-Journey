public class buildTree {
    static int Tree[];

    public static void init(int n){
        Tree = new int[n*4];
    }

    public static int buildST(int arr[],int stindx,int start,int end){
        int mid = (start+end)/2;
        if(start == end){ //leaf nodes
            Tree[stindx] = arr[start];
            return arr[start];
        }
        buildST(arr, 2*stindx+1, start, mid);
        buildST(arr, 2*stindx+2, mid+1, end);
        Tree[stindx] = Tree[2*stindx+1]+Tree[2*stindx+2];
        return Tree[stindx];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        System.out.println(buildST(arr, 0, 0, n-1));
    }
}
