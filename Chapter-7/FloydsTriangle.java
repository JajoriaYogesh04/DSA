import java.util.*;

public class FloydsTriangle {

    public static void floydsTriangle(int n){
        int number=1;
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= i; j++){
                System.out.print(" "+number+" ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Line Number: ");
        int line= sc.nextInt();
        floydsTriangle(line);
    }
}