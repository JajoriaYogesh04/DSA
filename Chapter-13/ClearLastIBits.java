import java.util.Scanner;
public class ClearLastIBits {
    public static int clearLastIBits(int num, int i){
        int bitMask= ~(0)<<i;
        return num & bitMask;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        System.out.print("Enter digits to clear: ");
        int clear= sc.nextInt();
        System.out.println(clearLastIBits(num, clear));
    }
}