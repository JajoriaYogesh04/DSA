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

        System.out.print("Enter N: ");
        int n= sc.nextInt();
        int counter= 1;
        while (counter<=n) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}