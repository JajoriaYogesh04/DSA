import java.util.*;
public class RemoveDuplicates {
    public static StringBuilder removeDuplicates(String str, boolean arr[], int i, StringBuilder sb){
        if(i==str.length()){
            return sb;
        }
        if(arr[str.charAt(i)-'a']==false){
            sb.append(str.charAt(i));
            arr[str.charAt(i)-'a']=true;
        }
        return removeDuplicates(str, arr, i+1, sb);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String: ");
        String str= sc.next();
        boolean arr[]= new boolean[26];
        int i=0;
        StringBuilder sb= new StringBuilder("");
        System.out.println(removeDuplicates(str, arr, i, sb));
    }
}