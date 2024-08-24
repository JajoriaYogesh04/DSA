import java.util.Scanner;

public class Power {
    public static int power(int a, int i){
        if(i==0){
            return 1;
        }
        return a*power(a, i-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base= sc.nextInt();
        System.out.print("Enter Power: ");
        int power= sc.nextInt();
        System.out.println(power(base, power));
    }
}