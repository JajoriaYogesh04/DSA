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

    public static void swap(int a, int b){
        int temp;
        temp= a;
        a= b;
        b= temp;
        System.out.println(a+" "+b);
        return;
    }

    public static int multiply(int a, int b){
        int product= a*b;
        return product;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // printHelloWorld();

        // System.out.print("Enter first number: ");           //Functions with parameters        
        // int num1= sc.nextInt();
        // System.out.print("Enter second number: ");
        // int num2= sc.nextInt();
        // int sum= getSum(num1,num2);
        // System.out.println("Sum: "+ sum);

        // System.out.print("Enter first number: ");           //Swapping(Call by value)             
        // int a= sc.nextInt();
        // System.out.print("Enter second number: ");
        // int b= sc.nextInt();
        // System.out.println(a+" "+b);
        // swap(a, b);
        // System.out.println(a+" "+b);

        System.out.print("Enter first number: ");               //Product of two numbers
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        int mul= multiply(num1, num2);
        System.out.println(num1+" x "+num2+" = "+mul);
    }
}