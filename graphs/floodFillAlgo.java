public class floodFillAlgo {
    public static void helper(int img[][],int src,int dest,int col,boolean isVisit[][],int org){

        if(src < 0 || dest < 0 || src >= img.length || dest >= img[0].length || isVisit[src][dest] || img[src][dest] != org){
            return;
        }
        //left
        helper(img, src, dest-1, col, isVisit, org);
        //right
        helper(img, src, dest+1, col, isVisit, org);
        //top
        helper(img, src-1, dest, col, isVisit, org);
        //down
        helper(img, src+1, dest, col, isVisit, org);
    }
    public static int[][] floodFill(int img[][],int src,int dest,int col){

        boolean isVisit[][] = new boolean[img.length][img[0].length];
        helper(img,src,dest,col,isVisit,img[src][dest]);
        return img; 
    }
    public static void main(String[] args) {
        
    }
}
