import java.util.*;
public class BinaryStrings {
    public static void binaryStrings(int n, String str, int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(lastPlace==0){
        //     binaryStrings(n-1, str+"0", 0);
        //     binaryStrings(n-1, str+"1", 1);
        // }
        // else{
        //     binaryStrings(n-1, str+"0", 0);
        // }
        binaryStrings(n-1, str+"0", 0);
        if(lastPlace==0){
            binaryStrings(n-1, str+"1", 1);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n= sc.nextInt();
        String str= "";
        int lastPlace= 0;
        binaryStrings(n, str, lastPlace);
    }
}