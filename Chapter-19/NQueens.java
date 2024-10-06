public class NQueens {
    public static void nQueens(String board[][], int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j= 0; j<board[0].length; j++){          //j=>columns
            board[row][j]= "Q";
            nQueens(board, row+1);
            board[row][j]= ".";
        }
    }
    public static void printBoard(String board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n= 2;
        String board[][]= new String[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]= ".";
            }
        }
        nQueens(board, 0);
    }
}