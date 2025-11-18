import java.util.Scanner;

public class diagonalSum {
    public static int sum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j) sum+=matrix[i][j];
                else if((i+j) == matrix.length-1) sum+=matrix[i][j];
                else continue;
            }
        }
        return sum;
    }
    public static int sum2(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i) sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum " + sum(matrix));
        System.out.println("sum " + sum2(matrix));
    }
}
