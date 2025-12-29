// package greedyAlgorithms;

import java.util.*;

public class chainPairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int maxCount = 0;
        maxCount = 1;

        int lastEnd = pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            //non overlapping

            if(pairs[i][0] >= lastEnd){
                //selection
                maxCount++;
                lastEnd = pairs[i][1];
            }

        }

        System.out.println("Maximum pairs : "+maxCount);
    }
}
