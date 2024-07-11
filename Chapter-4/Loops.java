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

        // System.out.print("Enter number: ");         //Print reverse of a number 
        // int num= sc.nextInt();
        // int rev= 0;
        // while (num > 0) {
        //     rev= num%10;
        //     num/=10;
        //     System.out.print(rev);
        // }

        // System.out.print("Enter number: ");         //reverse a number 
        // int num= sc.nextInt();
        // int rev= 0;
        // while (num > 0) {
        //     rev= (rev*10)+num%10;
        //     num/=10;
        // }
        // System.out.print(rev);

        // int counter=1;          //Do-while loop
        // do{
        //     System.out.println("Hello World " + counter);
        //     counter++;
        // }while(counter<=10);

        // for(int i=1; i<=10; i++){           //Break Statement
        //     if(i==3){
        //         System.out.println("I am OUT");
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // int num;            //Example break keyword
        // do{
        //     System.out.print("Enter number: ");
        //     num= sc.nextInt();
        //     if(num%10 == 0){
        //         System.out.println(num + " is multiple of 10");
        //         break;
        //     }
        // }while(true);

        // for(int i=1; i<=10; i++){           //continue statement
        //     if(i==9){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // int num;            //Example continue keyword
        // do{
        //     System.out.print("Enter number: ");
        //     num= sc.nextInt();
        //     if(num%10==0){
        //         continue;
        //     }
        //     System.out.println(num);
        // }while(true);

        System.out.print("Enter number: ");         //Check if number is prime or not
        int num= sc.nextInt();
        boolean isPrime= true;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                // System.out.println("Not Prime");
                isPrime= false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}