import java.util.*;
public class FastExponentiation {
    public static int fastExponentiation(int base, int power){
        int a= base;
        int exp= 1;
        while(power>0){
            if((power & 1)==1){
                exp= base*a;
            }
            power= power>>1;
            a*=a;
        }
        return exp;
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base: ");
        int base= sc.nextInt();
        System.out.print("Enter power: ");
        int power= sc.nextInt();
        System.out.println(fastExponentiation(base, power));
    }
}