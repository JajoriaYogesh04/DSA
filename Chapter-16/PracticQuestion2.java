import java.util.*;
public class PracticQuestion2 {
    public static void numToString(int num, String arr[]){
        if(num==0){
            return;
        }
        int ld= num%10;
        // num/=10;
        numToString(num/10, arr);
        System.out.print(arr[ld]);
        // if(ld==0){
        //     System.out.print("Zero ");
        // }
        // else if(ld==1){
        //     System.out.print("One ");
        // }
        // else if(ld==2){
        //     System.out.print("Two ");
        // }
        // else if(ld==3){
        //     System.out.print("Three ");
        // }
        // else if(ld==4){
        //     System.out.print("Four ");
        // }
        // else if(ld==5){
        //     System.out.print("Five ");
        // }
        // else if(ld==6){
        //     System.out.print("Six ");
        // }
        // else if(ld==7){
        //     System.out.print("Seven ");
        // }
        // else if(ld==8){
        //     System.out.print("Eight ");
        // }
        // else if(ld==9){
        //     System.out.print("Nine ");
        // }
        // else{
        //     return;
        // }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        String arr[]= {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        numToString(num, arr);
    }
}