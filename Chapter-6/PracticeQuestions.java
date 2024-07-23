import java.util.*;
public class PracticeQuestions {

    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // System.out.print("Enter first number: ");                   //Practice Question 1
        // int a= sc.nextInt();
        // System.out.print("Enter second number: ");
        // int b= sc.nextInt();
        // System.out.print("Enter third number: ");
        // int c= sc.nextInt();
        // int avg= avg(a, b, c);
        // System.out.println("Average: "+avg);

        System.out.print("Enter Number: ");                         //Practice Question 2
        int num= sc.nextInt();
        boolean isEven= isEven(num);
        if(isEven){
            System.out.println(num+" is EVEN");
        }
        else{
            System.out.println(num+" is ODD");
        }
    }
}