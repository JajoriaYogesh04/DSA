import java.util.Scanner;
public class PracticeQuestion2 {
    public static void SumSecondRow(int arr[][]){
        int sum= 0;
        for(int i=0; i<arr[1].length; i++){
            sum+=arr[1][i];
        }
        System.out.println(sum);
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
        SumSecondRow(metrix);
    }
}