import java.util.*;
public class PracticeQuestion1{
    public static int lowerVowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            int ch= (int)str.charAt(i);
            // System.out.println(ch);
            if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117){
                count++;
            }
        }
        // System.out.println(count);
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        String str= sc.next();
        System.out.println(lowerVowel(str));
    }
}