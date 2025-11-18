import java.util.Scanner;

public class largest {
    public static int largest(int arr[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] > largest) largest = arr[i][j];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Largest element = "+largest(matrix));
    }
}
