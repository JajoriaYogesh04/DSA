import java.util.*;

public class Butterfly {

    public static void upper(int n){
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= i; j++){
                System.out.print(" * ");
            }
            for(int j= 1; j<=2*(n-i); j++){
                System.out.print("   ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void lower(int n){
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= n-i+1; j++){
                System.out.print(" * ");
            }
            for(int j= 1; j<=2*(i-1); j++){
                System.out.print("   ");
            }
            for(int j= 1; j<=n-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        upper(n);
        lower(n);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Eneter Number: ");
        int num= sc.nextInt();
        butterfly(num);
    }
}