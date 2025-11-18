import java.util.Scanner;

public class creation {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //inserting elements 
        int matrix[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //printing elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
