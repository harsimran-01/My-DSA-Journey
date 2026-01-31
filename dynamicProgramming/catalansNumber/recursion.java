// package dynamicProgramming.catalansNumber;

public class recursion {
    public static int catalan_Number(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += catalan_Number(i) * catalan_Number(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalan_Number(4));
    }
}
