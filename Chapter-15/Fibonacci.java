import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int fib= fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        System.out.println(fibonacci(num));
    }
}