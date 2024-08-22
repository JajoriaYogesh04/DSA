import java.util.Scanner;

public class RecursionBasics {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        printDec(num);
    }
}