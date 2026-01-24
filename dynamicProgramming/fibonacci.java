// package dynamicProgramming;
// package dynamic_programming;

public class fibonacci {

    //memoziation method
    //approach 1 -> time complexity -(exponential)
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //approach 2 -> time complexity -(linear) O(n)
    public static int fib2(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fib2(n - 1, f) + fib2(n - 2, f);
        return f[n];
    }

    //tabulation method
    public static int fibTab(int n) {
        if (n == 0) return 0;
        int dp[] = new int[n + 1];
        // dp[0] = 0; //optional empty array is always 0
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Appraoch 1 -exponential");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        System.out.println("Appraoch 2 -dynamic programming");
        int f[] = new int[n + 1]; //0 - n
        for (int i = 0; i <= n; i++) {
            System.out.print(fib2(i, f) + " ");
        }
        System.out.println();
        System.out.println("Appraoch 3 -dynamic programming using tabulation method");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibTab(i) + " ");
        }
    }
}
