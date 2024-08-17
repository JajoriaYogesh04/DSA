import java.util.*;
public class CountSetBit {
    public static int countSetBit(int num){
        int count= 0;
        while(num>0){
            if((num & 1)!=0){
                count++;
            }
            num= num >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        System.out.println(countSetBit(num));
    }
}