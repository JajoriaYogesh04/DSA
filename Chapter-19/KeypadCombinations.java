import java.util.*;
public class KeypadCombinations {
    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int count= 0;
    public static void keypadCombinations(String letter[], String ans, int i){
        //base case
        if(i==letter.length){
            count++;
            System.out.println(ans);
            return;
        }
        //recursion
        for(int j=0 ; j<letter[i].length(); j++){
            keypadCombinations(letter, ans+letter[i].charAt(j), i+1);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Digits: ");
        String num= sc.next();
        String button[]= {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String letter[]= new String[num.length()];
        for(int i=0; i<num.length(); i++){
            int digit= num.charAt(i)-'0';
            letter[i]= button[digit-2];
        }
        String ans= "";
        keypadCombinations(letter, ans, 0);
        System.out.println(count);
    }
}