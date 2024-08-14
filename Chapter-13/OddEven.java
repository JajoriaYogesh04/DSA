import java.util.*;
public class OddEven {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        int bitMask= 1;
        if((num & bitMask) == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}