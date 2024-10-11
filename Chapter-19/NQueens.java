import java.util.*;
public class NQueens {
    public static boolean isSafe(String board[][], int row, int col){
        // boolean ret= true;
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=="Q"){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(String board[][], int row){
        if(row==board.length){
            count++;
            printBoard(board);
            return;
        }
        for(int j= 0; j<board[0].length; j++){          //j=>columns
            if(isSafe(board, row, j)){
                board[row][j]= "Q";
                nQueens(board, row+1);                      //function call
                board[row][j]= "X";                         //backtrack
            }
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
    static int count= 0;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();
        String board[][]= new String[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]= "X";
            }
        }
        nQueens(board, 0);
        System.out.println("Number of ways: "+count);
    }
}