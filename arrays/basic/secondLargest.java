import java.util.Scanner;

public class secondLargest {

    public static int secondNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(num>largest){
                second = largest;
                largest = num;
            }else if(num<largest && num>second) second = num;
        }
        if(second == Integer.MIN_VALUE) return -1;
        return second;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");
        int num[] = new int[parts.length];
        for(int i=0;i<num.length;i++){
            num[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(secondNum(num));
    }
}
