import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        // System.out.print("Enter Number: ");     //Practice Question 1
        // int num= sc.nextInt();
        // if(num>0){
        //     System.out.println("POSITIVE INTERGER");
        // }
        // else if(num<0){
        //     System.out.println("NEGATIVE INTEGER");
        // }
        // else{
        //     System.out.println("ZERO");
        // }

        System.out.print("Enter Temperature: ");        //Practice Question 2
        int temp= sc.nextInt();
        if(temp>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        }
    }
}