import java.util.Scanner;

public class PracticeQuestion4 {
    public static int TrappingWater(int arr[]){

        int leftMaxArr[]= new int [arr.length];             //Left Maximum
        int leftMax= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>leftMax){
                leftMax= arr[i];
            }
            leftMaxArr[i]= leftMax;
            // System.out.print(leftMaxArr[i]+" ");
        }
        printArray(leftMaxArr);
        System.out.println();

        int rightMaxArr[]= new int [arr.length];             //Right Maximum
        int rightMax= Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>rightMax){
                rightMax= arr[i];
            }
            rightMaxArr[i]= rightMax;
            // System.out.print(rightMaxArr[i]+" ");
        }
        printArray(rightMaxArr);
        System.out.println();

        int minMaxArr[]= new int [arr.length];              //minimum of left and right
        int minMax= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(leftMaxArr[i]>rightMaxArr[i]){
                minMaxArr[i]= rightMaxArr[i]; 
            }
            else{
                minMaxArr[i]= leftMaxArr[i];
            }
        }
        printArray(minMaxArr);
        System.out.println();

        int voulme= 0;
        for(int i=0; i<arr.length; i++){
            voulme+=(minMaxArr[i]-arr[i])*1;
        }
        return voulme;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void inputArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter: ");
            arr[i]= sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length= sc.nextInt();
        int arr[]= new int[length];
        inputArray(arr);
        int volume= TrappingWater(arr);
        System.out.print("Trapped Volume: "+volume);
    }
}