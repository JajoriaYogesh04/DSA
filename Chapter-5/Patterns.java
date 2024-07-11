import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        
        // System.out.print("Enter number: ");         //Star pattern
        // int n= sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter number: ");         //Inverted star pattern
        // int n= sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter number: ");         //Half pyramid pattern
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}