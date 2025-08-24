
import java.util.ArrayList;

public class pairsum1 {

    public static void pairSum(ArrayList<Integer> list, int target) {

        System.out.println("Brute Force Approach");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("Pair = (" + list.get(i) + "," + list.get(j) + ")");
                }
            }
        }
    }

    public static void pairSumOptimized(ArrayList<Integer> list, int target) {
        System.out.println("Optimized Appraoch");
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // case1
            if (list.get(left) + list.get(right) == target) {
                System.out.println("Pair = (" + list.get(left) + "," + list.get(right) + ")");
                left++;
                right--;
            }

            //case2
            if (list.get(left) + list.get(right) < target) {
                left++;
            }
            if (list.get(left) + list.get(right) > target) {
                right--;
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        pairSum(list, target);
        pairSumOptimized(list, target);
    }
}
