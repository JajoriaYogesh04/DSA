import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");     //Practice Question 1
        int num= sc.nextInt();
        if(num>0){
            System.out.println("POSITIVE INTERGER");
        }
        else if(num<0){
            System.out.println("NEGATIVE INTEGER");
        }
        else{
            System.out.println("ZERO");
        }
    }
}