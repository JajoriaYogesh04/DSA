import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int marks[]= new int[50];               //Empty array           
        int numbers[]= {21, 23, 49, 89, 78, 59};
        String fruits[]= {"Mango", "Apple", "Banana"};

        System.out.print("Enter marks: ");
        marks[0]= sc.nextInt();
        System.out.print("Enter marks: ");
        marks[1]= sc.nextInt();
        System.out.print("Enter marks: ");
        marks[2]= sc.nextInt();
        System.out.println("Subject 1: "+marks[0]);
        System.out.println("Subject 2: "+marks[1]);
        System.out.println("Subject 3: "+marks[2]);
        // marks[2]= 70;
        // System.out.println("Subject 3(updated): "+marks[2]);
        System.out.println("Percentage: "+ (marks[0]+marks[1]+marks[2])/3+"%");

        System.out.println(marks.length);
        System.out.println(numbers.length);
    }
}