public class queriesST {
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
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        //case 1 -> non overlapping
        if(qj <= si || qi >= sj){
            return 0;
        }else if(si>=qi && sj<=qj){
            //complete overlapping
            return Tree[i];
        }else{
            //partial overllaping
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1, si,mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1,sj, qi, qj);
            return left+right;
        }

    }
    public static int getSum(int arr[],int qi,int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        System.out.println(buildST(arr, 0, 0, n-1));

       System.out.println(getSum(arr,2,5));


    }
}
