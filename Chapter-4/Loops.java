import java.util.*;

public class Loops {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // int counter= 0;     //While lopp
        // while(counter < 100){
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("HW 100 times");

        // int counter=1;      //Numbers 1 to 10
        // while(counter<=10){
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        // System.out.print("Enter N: ");      //Printing numbers 1 to n
        // int n= sc.nextInt();
        // int counter= 1;
        // while (counter<=n) {
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        // System.out.print("Enter N: ");      //Print sum of first n natural numbers
        // int n= sc.nextInt();
        // int sum= 0;
        // int counter=1;
        // while(counter<=n){
        //     sum+=counter;
        //     counter++;
        // }
        // System.out.println("Sum: " + sum);

        // for(int i=1; i<=10; i++){       //For loop
        //     System.out.println("Hello " + i);
        // }

        // System.out.print("Enter N: ");      //Printing square pattern
        // int n= sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print(" [] ");
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter number: ");         //Print reverse of a number 
        int num= sc.nextInt();
        int rev= 0;
        while (num > 0) {
            rev= num%10;
            num/=10;
            System.out.print(rev);
        }
    }
}