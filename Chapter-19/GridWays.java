import java.util.Scanner;

public class GridWays {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int gridWays(int i, int j, int row, int col){
        // if(i==row-1||j==col-1){
        //     return 1;
        // }

        if(i==row-1 && j==col-1){                                          //Approach 1
            return 1;
        }
        if(i==row || j==col){
            return 0;
        }
        return gridWays(i+1, j, row, col)+gridWays(i, j+1, row, col);

        // return factorial(row+col-2)/(factorial(row-1)*factorial(col-1));      //Approach 2
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int row= sc.nextInt();
        System.out.print("Enter M: ");
        int col= sc.nextInt();
        System.out.println(gridWays(0, 0, row, col));
    }
}