import java.util.*;

public class PracticeQuestions {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // int num;            //Practice Question 2
        // int evenSum=0;
        // int oddSum=0;
        // int choice=1;
        // while(choice!=0){
        //     System.out.print("Enter Number: ");
        //     num= sc.nextInt();
        //     // System.out.println(num);
        //     if(num%2==0){
        //         evenSum+=num;
        //     }
        //     else{
        //         oddSum+=num;s
        //     }
        //     System.out.print("Enter 0 to exit & 1 to continue: ");
        //     choice= sc.nextInt();
        // }
        // System.out.println("Even Sum: "+evenSum);
        // System.out.println("Odd Sum: "+oddSum);

        // System.out.print("Enter Number: ");         //Practice Question 2
        // int num= sc.nextInt();
        // int fact=1;
        // for(int i=1; i<=num; i++){
        //     fact*=i;
        // }
        // System.out.println("Factorial: "+fact);

        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}