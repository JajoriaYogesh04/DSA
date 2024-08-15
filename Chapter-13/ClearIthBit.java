import java.util.*;
public class ClearIthBit {
    public static int clearIthBit(int num, int i){
        int bitMask= ~(1<<i);
        return num & bitMask;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        System.out.print("Enter position: ");
        int position= sc.nextInt();
        System.out.println(clearIthBit(num, position));
    }
}