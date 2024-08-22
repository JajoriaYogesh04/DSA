import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int factorial= n*(factorial(n-1));
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        System.out.println(factorial(num));
    }
}