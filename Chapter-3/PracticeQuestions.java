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

        // System.out.print("Enter Temperature: ");        //Practice Question 2
        // int temp= sc.nextInt();
        // if(temp>100){
        //     System.out.println("You have fever");
        // }
        // else{
        //     System.out.println("You don't have fever");
        // }

        System.out.print("Enter week day number: ");        //Practice Question 3
        int day= sc.nextInt();
        switch(day){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default: System.out.println("ERROR: Check input");
        }
    }
}