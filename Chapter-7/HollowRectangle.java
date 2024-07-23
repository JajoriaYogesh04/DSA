import java.util.*;

public class HollowRectangle {

    public static void printHollowRectangle(int l, int w){
        for(int i=1; i<=l; i++){
            for(int j=1; j<=w; j++){
                if(i==1 || j==1 || i==l || j==w){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length= sc.nextInt();
        System.out.print("Enter Width: ");
        int width= sc.nextInt();
        printHollowRectangle(length, width);
    }
}