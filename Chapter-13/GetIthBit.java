import java.util.*;
public class GetIthBit {
    public static void getIthBit(int num, int i){
        int bitMask= (1 << i);
        // System.out.println(num & bitMask);
        if((num & bitMask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        System.out.print("Enter i: ");
        int position= sc.nextInt();
        getIthBit(num, position);
    }
}