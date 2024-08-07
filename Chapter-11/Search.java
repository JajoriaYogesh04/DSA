import java.util.*;
public class Search{
    public static void brutForce(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    System.out.print("("+i+","+j+")");
                }
            }
        }
    }
    public static int BinarySearchRow(int arr[], int key){
        int start= 0;
        int end= arr.length-1;
        int mid=0;
        while(start<=end){
            mid= (start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key>=arr[mid]){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void BinarySearch(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            int colIdx= BinarySearchRow(arr[i], key);
            if(colIdx!=-1){
                System.out.print("("+i+","+colIdx+")");
            }
        }
    }
    public static boolean stairCaseSearch(int arr[][], int key){
        int row= 0; 
        int col= arr[0].length-1;
        while(row<=arr.length-1 && col>=0){
            if(arr[row][col]==key){
                System.out.println("("+row+","+col+")");
                return true;
            }
            else if(arr[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("NOT FOUND!");
        return false;
    }
    public static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
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
        System.out.print("Enter Row Length: ");
        int row= sc.nextInt();
        System.out.print("Enter Column Length: ");
        int col= sc.nextInt();
        int matrix[][]= new int [row][col];
        inputArray(matrix);
        System.out.print("Enter Key: ");
        int key= sc.nextInt();
        printArray(matrix);

        // brutForce(arr, key);
        // BinarySearchRow(brr, 4);
        // BinarySearch(arr, key);

        stairCaseSearch(matrix, key);
    }
}