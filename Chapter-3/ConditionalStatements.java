import java.util.*;

public class ConditionalStatements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int age= 15;     IF-else
        // if (age>=18) {
        //     System.out.print("ADULT");
        // }
        // if (age>=13 && age<18) {
        //     System.out.print("TEENAGER");
        // }
        // else{
        //     System.out.print("CHILD");
        // }

        // int a= 35;       //Largest of two numbers
        // int b= 20;
        // if (a>b) {
        //     System.out.println("LARGEST: A");
        // }
        // else{
        //     System.out.println("LARGEST: B");
        // }

        int num= sc.nextInt();     //Even and odd numbers
        if(num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}