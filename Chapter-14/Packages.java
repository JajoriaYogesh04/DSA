import java.util.*;
import mypackage.myClass;

public class Packages {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);             //built in packages
        // int a= sc.nextInt();
        // System.out.println(a);

        myClass obj= new myClass();
        obj.message();
    }
}