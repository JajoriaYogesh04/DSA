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

    public static int reverse(int num){
        int rev= 0;
        while(num>0){
            int lastDigit= num%10;
            rev= (rev*10)+lastDigit;
            num/=10;
        }
        System.out.println(rev);
        return rev;
    }

    public static boolean isPalindrome(int num){
        int rev= reverse(num);
        if(num==rev){
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

        // System.out.print("Enter Number: ");                         //Practice Question 2
        // int num= sc.nextInt();
        // boolean isEven= isEven(num);
        // if(isEven){
        //     System.out.println(num+" is EVEN");
        // }
        // else{
        //     System.out.println(num+" is ODD");
        // }

        System.out.print("Enter Number: ");                           //Practice Question 3
        int num= sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is NOT a palindrome");
        }
    }
}