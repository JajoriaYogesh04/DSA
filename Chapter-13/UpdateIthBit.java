import java.util.*;
public class UpdateIthBit {
    public static int updateIthBit(int num, int i, int bit){
        if(bit==1){
            int bitMask= 1<<i;
            return num | bitMask;
        }
        else if(bit==0){
            int bitMask= ~(1<<i);
            return num & bitMask;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        System.out.print("Enter position: ");
        int position= sc.nextInt();
        System.out.print("Enter new bit: ");
        int newBit= sc.nextInt();
        System.out.println(updateIthBit(num, position, newBit));
    }
}