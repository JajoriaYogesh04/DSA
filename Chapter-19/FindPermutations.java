import java.util.*;
public class FindPermutations {
    public static void findPermutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int j=0; j<str.length(); j++){
            //remove from str
            String newStr= str.substring(0, j)+str.substring(j+1);
            //add to ans
            findPermutations(newStr, ans+str.charAt(j));
            
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        String str= sc.next();
        findPermutations(str, "");
    }
}