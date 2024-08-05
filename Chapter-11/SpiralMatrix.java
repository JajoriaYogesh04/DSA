import java.util.*;
public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]){
        int rowStart= 0;
        int colStart= 0;
        int rowEnd= arr.length-1;
        int colEnd= arr[0].length-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int j=colStart; j<=colEnd; j++){
                System.out.print(arr[rowStart][j]+" ");
            }
            for(int j=rowStart+1; j<=rowEnd; j++){
                System.out.print(arr[j][colEnd]+" ");
            }
            for(int j=colEnd-1; j>=colStart; j--){
                System.out.print(arr[rowEnd][j]+" ");
                if(rowStart==rowEnd){
                    break;
                }
            }
            for(int j=rowEnd-1; j>=rowStart+1; j--){
                System.out.print(arr[j][colStart]+" ");
                if(colStart==colEnd){
                    break;
                }
            }
            colStart++;
            colEnd--;
            rowStart++;
            rowEnd--;
            
        }
    }
    public static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void intputArray(int arr[][]){
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
        int martix[][]= new int [row][col];
        intputArray(martix);
        printArray(martix);
        spiralMatrix(martix);
    }
}