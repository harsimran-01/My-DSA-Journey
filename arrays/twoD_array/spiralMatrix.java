import java.util.Scanner;

public class spiralMatrix {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        int i,j;

        while(startRow <= endRow && startCol <= endCol){
            
            //j = col    i = row

            //top
            for(j = startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for(j = endCol - 1;j>=startCol;j--){
                if(startCol == endCol) break;
                System.out.print(matrix[endRow][j]+ " ");
            }

            //left
            for(i=endRow - 1;i>=startRow+1;i--){
                if(startRow == endRow) break;
                System.out.print(matrix[i][startCol]+ " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        spiral(matrix);

    }
}
