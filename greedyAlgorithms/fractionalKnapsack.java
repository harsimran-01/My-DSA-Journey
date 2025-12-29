
import java.util.*;

// package greedyAlgorithms;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weights[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weights[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;

        for(int i=ratio.length-1;i>=0;i--){
            int indx = (int)ratio[i][0];
            if(capacity >= weights[indx]){
                finalVal+=val[indx];
                capacity-=weights[indx];
            }else{
                finalVal+=(ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value : "+finalVal);


    }
}
