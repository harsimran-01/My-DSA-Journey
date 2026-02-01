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
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        init(arr.length);
        buildST(0, arr, 0, arr.length-1);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }
}
