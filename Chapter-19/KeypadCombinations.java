import java.util.*;
public class KeypadCombinations {
    // public static void printArray(String arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void keypadCombinations(String letter[], String ans, int i){
    //     //base case
    //     if(i==letter.length){
    //         count++;
    //         System.out.println(ans);
    //         return;
    //     }
    //     //recursion
    //     for(int j=0 ; j<letter[i].length(); j++){
    //         keypadCombinations(letter, ans+letter[i].charAt(j), i+1);
    //     }
    // }
    public static void bfs(int pos, int len, StringBuilder sb, String num){
        //base case
        if(pos==len){
            System.out.println(sb.toString());
        }
        //recursion
        else{
            char letter[] = button[Character.getNumericValue(num.charAt(pos))];
            for (int j = 0; j < letter.length; j++) {
                bfs(pos + 1, len, new StringBuilder(sb).append(letter[j]), num);
            }
        }
    }
    public static void keypadCombinations(String num){
        int len= num.length();
        if(len==0){
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), num);
    }
    public static char[][] button= {
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };
    public static int count= 0;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Digits: ");
        String num= sc.next();
        // String letter[]= new String[num.length()];
        // if(num.length()==0){
        //     System.out.println("");
        //     return;
        // }
        // for(int i=0; i<num.length(); i++){
        //     int digit= num.charAt(i)-'0';
        //     letter[i]= button[digit-2];
        // }
        // String ans= "";
        // keypadCombinations(letter, ans, 0);
        // System.out.println(count);
        keypadCombinations(num);
    }
}