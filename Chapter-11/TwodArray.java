import java.util.*;
public class TwodArray {
    public static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void inputArray(int arr[][]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print("Enter: ");
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Rows: ");
        int row= sc.nextInt();
        System.out.print("Columns: ");
        int columns= sc.nextInt();
        int matrix[][]= new int [row][columns];
        inputArray(matrix);
        printArray(matrix);
    }
}