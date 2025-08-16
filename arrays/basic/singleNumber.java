public class singleNumber {
    //brute force approach
    public static int single_number(int[] nums) {
        //your code goes here
        int n = nums.length;
        int maxi = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        int[] hash = new int[maxi+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }

        for(int i=0;i<n;i++){
            if(hash[nums[i]]==1){
                return nums[i];
            }
        }
        return -1;
    }

    //optimial approach
    public static int singlenumber(int[] nums){
        int n = nums.length;
        int xor = 0;

        for(int i=0;i<n;i++){
            xor = xor^nums[i];
        }
        return xor;

    }
    public static void main(String[] args) {
       int nums[] = {4,1,2,1,2};
        System.out.println(single_number(nums));
        System.out.println(singlenumber(nums));

    }
}
