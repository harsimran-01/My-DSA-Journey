package dynamicProgramming;
// package dynamic_programming;

public class fibonacci {
    //approach 1 -> time complexity -(exponential)
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    
    //approach 2 -> time complexity -(linear) O(n)
    public static int fib2(int n,int f[]){
        if(n==0||n==1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib2(n-1, f) + fib2(n-2, f);
        return f[n];
    }
    

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Appraoch 1 -exponential");
        for(int i=0;i<=n;i++){
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        System.out.println("Appraoch 2 -dynamic programming");
        int f[] = new int[n+1]; //0 - n
        for(int i=0;i<=n;i++){
            System.out.print(fib2(i,f) + " ");
        }
    }
}
