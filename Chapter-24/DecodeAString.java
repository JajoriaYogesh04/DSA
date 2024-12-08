import java.util.*;
public class DecodeAString {
    public static String decodeAString(String encode){
        Stack<Integer> num= new Stack<>();
        Stack<Character> str= new Stack<>();
        int n= encode.length();
        String decode="";
        for(int i=0; i<n; i++){
            char ch= encode.charAt(i);
            int count=0;
            if(Character.isDigit(ch)){
                while(i<n && Character.isDigit(encode.charAt(i))){
                    count= 10*count+(encode.charAt(i)-'0');
                    i++;
                }
                i--;
                num.push(count);
            }
            else if(ch==']'){
                String temp= "";
                while(!str.isEmpty() && str.peek()!='['){
                    temp=str.pop()+temp;
                }
                if(!str.isEmpty() && str.peek()=='['){
                    str.pop();
                }
                if(!num.isEmpty()){ 
                    count= num.pop();
                }
                String sb= "";
                for(int j=0; j<count; j++){
                    sb+=temp;
                }
                for(int j=0; j<temp.length()*count; j++){
                    str.push(sb.charAt(j));
                }
            }
            else if(ch=='['){
                if(i>0 && Character.isDigit(encode.charAt(i-1))){
                    str.push(ch);
                }
                else{
                    str.push(ch);
                    num.push(1);
                }
            }
            else{
                str.push(ch);
            }
        }
        while(!str.isEmpty()){
            decode=str.pop()+decode;
        }
        return decode;
    }
    public static void main(String args[]){
        // Test cases
        String[] testCases = {
            "3[a2[c]]",        // Nested encoding
            "2[abc]3[cd]ef",   // Mixed encoding
            "10[a]",           // Large repeat count
            "20[leetcode]",    // Large repeat count with long string
            "3[ab]",           // Simple case
            "2[a2[b4[F]]]c",   // Deeply nested encoding
            "3[z]2[2[y]pq4[2[jk]e1[f]]]ef" // Complex case
        };
        for (String test : testCases) {
            System.out.println("Encoded: " + test);
            System.out.println("Decoded: " + decodeAString(test));
            System.out.println();
        }
    }
}