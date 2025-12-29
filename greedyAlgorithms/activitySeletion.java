
import java.util.*;


// package greedyAlgorithms;

public class activitySeletion {
    public static void main(String[] args) {

        //if end time is sorted
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for(int i=1;i<end.length;i++){
            //NON -overlapping checking

            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activities : "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

        // if end time is not sorted

        int start1[] = {0,1,3,5,5,8};
        int end1[] = {4,6,2,7,9,9};

        int activities[][] = new int[start1.length][3];
        for(int i=0;i<start1.length;i++){
            activities[i][0] = i;
            activities[i][1] = start1[i];
            activities[i][2] = end1[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        int maxAct1 = 0;
        ArrayList<Integer> ans1 = new ArrayList<>();

        maxAct1 = 1;
        ans1.add(activities[0][0]);

        int lastEnd1 = activities[0][2];

        for(int i=1;i<end.length;i++){
            //non overlapping

            if(activities[i][1] >= lastEnd1){
                maxAct1++;
                ans1.add(activities[i][0]);
                lastEnd1 = activities[i][2];
            }
        }

        System.out.println("Max activities : "+maxAct1);
        for(int i=0;i<ans1.size();i++){
            System.out.print("A"+ans1.get(i)+" ");
        }





    }
}
