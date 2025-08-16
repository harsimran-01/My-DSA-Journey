public class gridWays {
    public static int countWays(int i,int j,int n,int m){
        if(i==n-1 && j==m-1) return 1;
        else if(i==n || j==m) return 0;

        int w1 = countWays(i+1, j, n, m);
        int w2 = countWays(i, j+1, n, m);
        return w1+w2;

    }
    public static void main(String[] args) {
        int n = 3,m = 3;
        System.out.println(countWays(0,0,n,m));
    }
}
