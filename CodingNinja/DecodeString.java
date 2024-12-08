import java.util.*;
public class Solution 
{
    public static String decodeString(String s) 
	{
        // Write your code here.
        Stack<Integer> num= new Stack<>();
        Stack<Character> str= new Stack<>();
        int n= s.length();
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            int count= 0;
            if(Character.isDigit(ch)){
                while(Character.isDigit(s.charAt(i))){
                    count= count*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                num.push(count);
            }
            else if(ch=='['){
                str.push(ch);
            }
            else if(ch==']'){
                StringBuilder temp= new StringBuilder();
                while(!str.isEmpty() && str.peek()!='['){
                    temp.insert(0, str.pop());
                }
                str.pop();
                count= num.pop();
                StringBuilder sb= new StringBuilder();
                for(int j=0; j<count; j++){
                    sb.append(temp);
                }
                for(int j=0; j<sb.length(); j++){
                    str.push(sb.charAt(j));
                }
            }
            else{
                str.push(ch);
            }
        }
        StringBuilder res= new StringBuilder();
        while(!str.isEmpty()){
            res.insert(0, str.pop());
        }
        return res.toString();
    }
}