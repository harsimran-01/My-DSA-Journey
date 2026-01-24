// package knapsack0_1;

public class recursion {
    public static int knapsack(int val[],int wt[],int indx,int W){
        if(W == 0 || indx == 0){
            return 0;
        }
        if(wt[indx-1] <= W){
            //include
            int ans1 = val[indx-1]+knapsack(val, wt, indx-1, W-wt[indx-1]);
            //exclude
            int ans2 = knapsack(val, wt, indx-1, W);

            return Math.max(ans1, ans2);
        }else{
            //exclude
            return knapsack(val, wt, indx-1, W);
        }

    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.print(knapsack(val, wt, val.length, W));

    }
}
