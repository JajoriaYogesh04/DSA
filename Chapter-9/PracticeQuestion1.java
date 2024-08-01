import java.util.*;
public class PracticeQuestion1 {
    public static boolean duplicate(int arr[]){
        boolean duplicate= false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    duplicate= true;
                }
            }
        }
        return duplicate;
    }
    public static void inputArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter: ");
            arr[i]= sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int length= sc.nextInt();
        int arr[]= new int[length];
        inputArray(arr);
        System.out.println(duplicate(arr));
    }
}