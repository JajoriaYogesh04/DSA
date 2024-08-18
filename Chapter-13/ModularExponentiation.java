import java.util.*;
public class ModularExponentiation {
    public static int modularExponentiation(int base, int power, int mod){
        int a= base % mod;
        int exp= 1;
        while(power>0){
            if((power & 1) != 0){
                exp= (exp*a) % mod;
            }
            power= power>>1;
            a= (a*a) % mod;
        }
        return exp;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base: ");
        int base= sc.nextInt();
        System.out.print("Enter power: ");
        int power= sc.nextInt();
        System.out.print("Enter Modulus: ");
        int mod= sc.nextInt();
        System.out.println(modularExponentiation(base, power, mod));
    }
}