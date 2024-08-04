import java.util.*;
public class TwodArray {
    public static int largest(int arr[][]){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static int smallest(int arr[][]){
        int min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public static boolean search(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
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
        
        // System.out.print("Enter Search Element: ");
        // int key= sc.nextInt();
        // System.out.println(search(matrix, key));

        System.out.println("Largest Element: "+largest(matrix));
        System.out.println("Smallest Element: "+smallest(matrix));
    }
}