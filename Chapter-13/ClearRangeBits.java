import java.util.*;
public class ClearRangeBits {
    public static int toDecimal(int num){
        int dec=0;
        int i=0;
        while(num>0){
            dec+=(num%10)*Math.pow(2, i);
            i++;
            num/=10;
        }
        return dec;
    }
    public static int clearRangeBits(int num, int i, int j){
        int bitMask= ~(0)<<(j+1) | (1<<i)-1;
        return num & bitMask;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        System.out.print("Enter start: ");
        int start= sc.nextInt();
        System.out.print("Enter end: ");
        int end= sc.nextInt();
        System.out.println(clearRangeBits(num, start, end));
    }
}