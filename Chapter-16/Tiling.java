import java.util.*;
public class Tiling {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical= tiling(n-1);
        int horizontal= tiling(n-2);
        return horizontal + vertical;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length: ");
        int n= sc.nextInt();
        System.out.println(tiling(n));
    }   
}