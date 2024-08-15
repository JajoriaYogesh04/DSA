import java.util.*;
public class SetIthBit {
    public static void setIthBit(int num, int i){
        int bitMask= 1<<i;
        int set = (num | bitMask);
        System.out.println(set);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        System.out.print("Enter Position: ");
        int position= sc.nextInt();
        setIthBit(num, position);
    }
}