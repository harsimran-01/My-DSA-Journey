
import java.util.ArrayList;

public class pairsum2 {
    public static void pairSumOptimized2(ArrayList<Integer> list ,int target){
        int rp = -1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                rp = i;
                break;
            }
        }
        int lp = rp+1;
        while(lp!=rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                System.out.println("Pair = (" + list.get(lp) + "," + list.get(rp) + ")");
                lp = (lp + 1) % list.size();              // move left forward
            rp = (list.size() + rp - 1) % list.size(); 
            }

            //case 2

            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%list.size();
            }

            //case 3

            else if(list.get(lp)+list.get(rp) > target){
                rp = (list.size()+rp-1)%list.size();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        pairSumOptimized2(list ,target);


    }
}
