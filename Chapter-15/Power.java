import java.util.Scanner;

public class Power {
    // public static int power(int a, int i){
    //     if(i==0){
    //         return 1;
    //     }
    //     return a*power(a, i-1);
    // }
    public static int power(int a, int b){
        // if(b==1){
        //     return a;
        // }
        // if(b%2==0){
        //     return power(a, b/2) * power(a, b/2);
        // }
        // else{
        //     return a * power(a, (b-1)/2) * power(a, (b-1)/2);
        // }

        if(b==0){
            return 1;
        }
        int halfPower= power(a, b/2);
        int halfPowerSquare= halfPower * halfPower;
        if(b%2 != 0){
            return  a*halfPowerSquare;
        }
        return halfPowerSquare;
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