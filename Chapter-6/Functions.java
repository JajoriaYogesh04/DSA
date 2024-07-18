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

    public static int factorial(int n){
        int fact= 1;
        if(n<0){
            return 0;
        }
        else{
            for(int i=n; i>=1; i--){
                fact=fact*i;
            }
            return fact;
        }
    }

    public static int binomial(int n, int r){
        int nfact= factorial(n);
        int rfact= factorial(r);
        int nrfact= factorial(n-r);
        int coeff= (nfact)/(rfact*nrfact);
        return coeff;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int diff(int a, int b){
        return a-b;
    }

    public static float diff(float a, float b){
        return a-b;
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

        // System.out.print("Enter first number: ");               //Product of two numbers
        // int num1= sc.nextInt();
        // System.out.print("Enter second number: ");
        // int num2= sc.nextInt();
        // int mul= multiply(num1, num2);
        // System.out.println(num1+" x "+num2+" = "+mul);

        // System.out.print("Enter number: ");             //Factorial of number
        // int num= sc.nextInt();
        // int fact= factorial(num);
        // System.out.println(num+"!= "+fact);

        // System.out.print("n: ");                //Binomial Coefficient
        // int n= sc.nextInt();
        // System.out.print("r: ");
        // int r=sc.nextInt();
        // int binomialCoeff= binomial(n, r);
        // System.out.println(n+" C "+r+" = "+binomialCoeff);

        // System.out.println(sum(5,9));           //Function overloading using parameters
        // System.out.println(sum(7,6,5));

        System.out.println(diff(9,5));           //Function overloading using data types
        System.out.println(diff(15.4f,4.2f));
    }
}