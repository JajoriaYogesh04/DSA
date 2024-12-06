import java.util.*;
public class DuplicateParentheses {
    public static boolean duplicateParentheses(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch==')'){
                // s.push(ch);
                int count=0;
                // while(s.peek()!='('){
                //     s.pop();
                //     count++;
                // }
                // if(count<1){
                //     return true;
                // }
                // else{
                //     s.pop();
                // }
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        // Test cases
        String[] testCases = {
            "((a+b)+(c+d))",  // No duplicate
            "((a+b))",        // Duplicate
            "(a+b)+((c+d))",  // Duplicate
            "(a+(b))",        // No duplicate
            "(((a+b)))",      // Duplicate
            "a+b+c",          // No parentheses
            "()",             // Duplicate
            ""                // Empty string (no duplicate)
        };
        // Test each case
        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\" : Duplicate Parentheses: " + duplicateParentheses(testCase));
        }
    }
}