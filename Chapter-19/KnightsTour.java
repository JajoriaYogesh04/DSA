public class KnightsTour {
    public static boolean knightsTour(int board[][], int row, int col, int val){
        //base case
        if(val==(board.length)*(board[0].length)){
            return true;
        }
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=0){
            return false;
        }
        //recurstion
        board[row][col]= val;
        if(knightsTour(board, row+2, col+1, val+1)){
            return true;
        }
        if(knightsTour(board, row+1, col+2, val+1)){
            return true;
        }
        if(knightsTour(board, row-1, col+2, val+1)){
            return true;
        }
        if(knightsTour(board, row-2, col+1, val+1)){
            return true;
        }
        if(knightsTour(board, row-2, col-1, val+1)){
            return true;
        }
        if(knightsTour(board, row-1, col-2, val+1)){
            return true;
        }
        if(knightsTour(board, row+1, col-2, val+1)){
            return true;
        }
        if(knightsTour(board, row+2, col-1, val+1)){
            return true;
        }
        board[row][col]= 0;
        return false;
    }
    public static void printBoard(int board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n= 8;
        int board[][]= new int[n][n];
        knightsTour(board, 0, 0, 0);
        printBoard(board);
    }
}