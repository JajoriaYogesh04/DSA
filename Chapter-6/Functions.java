import java.util.*;

public class Functions{

    public static void printHelloWorld(){           //Syntax of functions
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static int getSum(int a, int b){         
        int sum= a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // printHelloWorld();

        System.out.print("Enter first number: ");           //Functions with parameters        
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        int sum= getSum(num1,num2);
        System.out.println("Sum: "+ sum);
    }
}