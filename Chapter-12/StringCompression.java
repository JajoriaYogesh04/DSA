import java.util.*;
public class StringCompression {
    public static String stringCompression(String str){
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            sb.append(ch);
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
                // System.out.println(count);
            }
            // System.out.println(count);
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        String str= sc.next();
        stringCompression(str);
        System.out.println(stringCompression(str));
    }
}