import java.util.*;
public class FirstNonRepeatingLetter{
    public static String firstNonRepeatingLetter(String str){
        String result="";
        int arr[]= new int[26];
        Queue<Character> q= new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            q.add(str.charAt(i));
            arr[str.charAt(i)-'a']++;
            while(!q.isEmpty() && arr[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                result+="-1";
            }
            else{
                result+=q.peek();
            }
        }
        return result;
    }
    public static void main(String args[]){
        // String str= "aabccxb";
        // String fnrl= firstNonRepeatingLetter(str);
        // System.out.println(fnrl);
        // Test case 1
        String str1 = "aabccxb";
        String fnrl1 = firstNonRepeatingLetter(str1);
        System.out.println("Input: " + str1);
        System.out.println("First Non-Repeating Letters: " + fnrl1);

        // Test case 2
        String str2 = "abcabc";
        String fnrl2 = firstNonRepeatingLetter(str2);
        System.out.println("\nInput: " + str2);
        System.out.println("First Non-Repeating Letters: " + fnrl2);

        // Test case 3
        String str3 = "aaabbbccc";
        String fnrl3 = firstNonRepeatingLetter(str3);
        System.out.println("\nInput: " + str3);
        System.out.println("First Non-Repeating Letters: " + fnrl3);

        // Test case 4
        String str4 = "aabbcddee";
        String fnrl4 = firstNonRepeatingLetter(str4);
        System.out.println("\nInput: " + str4);
        System.out.println("First Non-Repeating Letters: " + fnrl4);

        // Test case 5
        String str5 = "zxyzz";
        String fnrl5 = firstNonRepeatingLetter(str5);
        System.out.println("\nInput: " + str5);
        System.out.println("First Non-Repeating Letters: " + fnrl5);

        // Test case 6
        String str6 = "abcdefghijklmnopqrstuvwxyz";
        String fnrl6 = firstNonRepeatingLetter(str6);
        System.out.println("\nInput: " + str6);
        System.out.println("First Non-Repeating Letters: " + fnrl6);

        // Test case 7
        String str7 = ""; // Edge case: empty string
        String fnrl7 = firstNonRepeatingLetter(str7);
        System.out.println("\nInput: (empty string)");
        System.out.println("First Non-Repeating Letters: " + fnrl7);
    }
}