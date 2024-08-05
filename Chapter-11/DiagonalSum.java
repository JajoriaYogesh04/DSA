import java.util.*;
public class DiagonalSum {
    public static void diagonalSum(int arr[][]){
        int sum=0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<arr.length; i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println("Diagonal Sum: "+sum);

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
        System.out.print("Side Length: ");
        int side= sc.nextInt();
        int arr[][]= new int [side][side];
        inputArray(arr);
        diagonalSum(arr);
    }
}