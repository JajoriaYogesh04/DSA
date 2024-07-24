import java.util.*;

public class InvertedHalfPyramidNumbers {

    public static void invertedHalfPyramidNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" "+j+" ");
            }
            // for(int j=1; j<=i-1; j++){
            //     System.out.print("   ");
            // }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        invertedHalfPyramidNumbers(num);
    }
}