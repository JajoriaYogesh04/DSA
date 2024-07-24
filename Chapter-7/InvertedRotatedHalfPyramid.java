import java.util.*;

public class InvertedRotatedHalfPyramid {

    public static void invertedRotatedHalfPyramid(int l){
        // for(int i= 1; i<= l; i++){
        //     for(int j=1; j<= l; j++){
        //         if(j<=l-i){
        //             System.out.print("   ");
        //         }
        //         else{
        //             System.out.print(" * ");
        //         }
        //     }
        //     System.out.println();
        // }
        for(int i= 1; i<=l; i++){
            for(int j=1; j<=l-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length= sc.nextInt();
        invertedRotatedHalfPyramid(length);
    }
}