import java.util.*;
public class PracticeQuestion1 {
    public static int countArray(int arr[][], int key){
        int count= 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
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
        int metrix[][]= new int [row][col];
        inputArray(metrix);
        System.out.print("Enter key: ");
        int key= sc.nextInt();
        countArray(metrix, key);
    }
}