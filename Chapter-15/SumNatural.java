import java.util.Scanner;

public class SumNatural {
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        // System.out.println(n);
        int sum= n + (sumNatural(n-1));
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        int n= sc.nextInt();
        System.out.println(sumNatural(n));
    }
}