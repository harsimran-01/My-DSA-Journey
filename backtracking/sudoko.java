public class sudoko {

    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoko[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoko[row][j] == digit){
                return false;
            }
        }

        //grid

        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoko[row][j] == digit){
                return false;
            }
            }
        }
        return true;
    }
    public static boolean sudokoSolver(int sudoko[][],int row,int col){

        if(row==9 && col == 0){
            return true;
        }

        int nextrow = row, nextCol = col+1;
        if(col==9){
            nextrow = row+1;
            nextCol = 0;
        } 
        if(sudoko[row][col] != 0){
            return sudokoSolver(sudoko, nextrow, nextCol);
        }
        for(int i=1;i<=9;i++){ 
            if(isSafe(sudoko,row,col)){
                sudoko[row][col] = i;
                if(sudokoSolver(sudoko, nextrow, nextCol)){
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int board[][]= {{}};
        sudokoSolver(board,row,col);
    }
}
