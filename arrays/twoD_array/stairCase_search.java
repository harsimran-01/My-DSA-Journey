import java.util.Arrays;
import java.util.Scanner;

public class stairCase_search {
    public static int[] stairCase(int matrix[][],int key){
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0; //top
        int j = m-1; //rightmost cell

        while(i<n && j>=0){
            if(matrix[i][j] == key) return new int[]{i,j};
            else if(key < matrix[i][j]) j--;
            else i++;
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("StairCase Search = "+Arrays.toString(stairCase(matrix,12)));
    }
}
