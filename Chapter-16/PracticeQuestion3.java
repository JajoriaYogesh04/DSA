import java.util.*;
public class PracticeQuestion3 {
    public static int stringLength(String str){
        if(str==""){
            return 0;
        }
        return stringLength(str.substring(1))+1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        String str= sc.next();
        System.out.println(stringLength(str));
    }
}