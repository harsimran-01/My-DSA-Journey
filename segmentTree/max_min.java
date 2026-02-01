public class max_min {
    static int tree[];
    public static void init(int n){
        tree = new int[n*4];
    }

    public static void buildST(int i,int arr[],int si,int sj){
        if(si==sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si+sj)/2;
        buildST(2*i+1, arr, si, mid);
        buildST(2*i+2, arr, mid+1, sj);
        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
        
    }
    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        //no overlap
        if(si>qj || sj<qi){
            return Integer.MIN_VALUE;
        }else if(si>=qi && sj<=qj){ //complete overlap
            return tree[i];
        }else{//partial overlap
            int mid = (si+sj)/2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1,sj, qi, qj);
            return Math.max(left, right);
        }

    }
    public static int getMax(int arr[],int qi,int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        init(arr.length);
        buildST(0, arr, 0, arr.length-1);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        int max = getMax(arr,2,5);
        System.out.println(max);
    }
}
