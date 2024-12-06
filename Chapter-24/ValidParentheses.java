import java.util.*;
public class ValidParentheses {
    public static boolean validParentheses(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((ch==')' && s.peek()=='(')||(ch=='}' && s.peek()=='{')||(ch==']' && s.peek()=='[')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String args[]){
        // Test cases
        String[] testCases = {
            "({[]})", // Valid
            "(",      // Invalid
            ")",      // Invalid
            "([)]",   // Invalid
            "{[()]}", // Valid
            ""        // Valid (empty string)
        };
        // Test each case
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " : " + validParentheses(testCase));
        }
    }
}