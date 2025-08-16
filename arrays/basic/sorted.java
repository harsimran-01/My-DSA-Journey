// Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

import java.util.ArrayList;
import java.util.Scanner;



// Examples:
// Input : nums = [1, 2, 3, 4, 5]
// Output : true
// Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.

// Input : nums = [1, 2, 1, 4, 5]
// Output : false
// Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.


public class sorted {

    public static boolean isSorted(ArrayList<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) > nums.get(i+1)) return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //size is not inputed in this 
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");
        for(String s : parts){
            list.add(Integer.parseInt(s));
        }
        System.out.println(isSorted(list));
    }

    
}
