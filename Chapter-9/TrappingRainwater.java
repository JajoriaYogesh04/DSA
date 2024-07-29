import java.util.*;

public class TrappingRainwater {
    public static int trappingRainwater(int arr[]){
        
        int leftMax= Integer.MIN_VALUE;
        int lmaxArr[]= new int[arr.length];
        System.out.print("Left Max Array: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=leftMax){
                leftMax=arr[i];
            }
            lmaxArr[i]= leftMax;
        }
        printArray(lmaxArr);
        System.out.println();

        int rightMax= Integer.MIN_VALUE;
        int rmaxArr[]= new int [arr.length];
        System.out.print("Right Max Array: ");
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>rightMax){
                rightMax=arr[i];
            }
            rmaxArr[i]=rightMax;
        }
        printArray(rmaxArr);
        System.out.println();

        int minMax[]= new int[arr.length];
        int minElement= Integer.MIN_VALUE;
        System.out.print("Minimun of Left-Right Max Array: ");
        for(int i=0; i<arr.length; i++){
            if(lmaxArr[i]<rmaxArr[i]){
                minElement=lmaxArr[i];
            }
            else{
                minElement=rmaxArr[i];
            }
            minMax[i]= minElement;
        }
        printArray(minMax);
        System.out.println();

        int volume= 0;
        for(int i=0; i<arr.length; i++){
            volume+=(minMax[i]-arr[i])*1;
        }

        return volume;
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
        int array[]= new int [length];
        inputArray(array);
        int trappingRainwater= trappingRainwater(array);
        System.out.println("Trapped Rainwater Volume: "+trappingRainwater);
    }
}