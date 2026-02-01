public class updateST {
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
    public static void updateUtil(int i,int si,int sj,int indx,int diff){
        if(indx>sj || indx<si){
            return;
        }
        Tree[i] +=diff;
        if(si!=sj){
            int mid = (si+sj)/2;
            updateUtil(2+i+1, si, mid, indx, diff);
            updateUtil(2*i+2, mid+1, sj, indx, diff);
        }

    }
    public static void update(int arr[],int indx,int newVal){
        int n = arr.length;
        int diff = newVal - arr[indx];
        arr[indx] = newVal;
        updateUtil(0, 0, n-1, indx, diff);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        System.out.println(buildST(arr, 0, 0, n-1));
        update(arr, 2, 2);
        for(int i=0;i<Tree.length;i++){
            System.out.print(Tree[i] + " ");
        }
        System.out.println();


    }
}
