import java.util.*;

public class Diamond {

    public static void upper(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void lower(int n){
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=(2*(n-i-1))+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // public static void lower(int n){
    //     for(int i=n; i>=1; i--){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print("   ");
    //         }
    //         for(int j=1; j<=(2*i)-1; j++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void diamond(int n){
        upper(n);
        lower(n);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        diamond(num);
    }
}