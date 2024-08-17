import java.util.*;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        isPowerOfTwo(num);
        if(isPowerOfTwo(num)){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not power of 2");
        }
    }
}