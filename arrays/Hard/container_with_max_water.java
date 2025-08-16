
import java.util.ArrayList;

public class container_with_max_water {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(list);
        //brute-force appraoch
        int max = 0;
        int water = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int heigth = Math.min(list.get(i), list.get(j));
                int width = j - i;
                water = heigth * width;
                max = Math.max(max, water);
            }

        }

        System.out.println(max);

        //2 pointers approach

        int left = 0;
        int right = list.size()-1;
        int max2 = 0;
        int water2 = 0;
        while(left<right){
            int ht = Math.min(list.get(left),list.get(right));
            int wd = right - left;
            water2 = ht*wd;
            max2 = Math.max(max2,water2);

            if(list.get(left)<list.get(right)){
                left++;
            }else{
                right--;
            }

        }
        System.out.println(max2);
    }
}
