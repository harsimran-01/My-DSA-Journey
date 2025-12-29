
import java.util.Scanner;
//Ques Given an array of integers nums, return the value of the largest element in the array

// Input: nums = [3, 3, 6, 1]
// Output: 6
// Explanation: The largest element in array is 6

// Input: nums = [3, 3, 0, 99, -40]
// Output: 99
// Explanation: The largest element in array is 99


public class largest1 {
    public static int largestNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");
        int arr[] = new int[parts.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(largestNum(arr));
        sc.close();
    }
}
