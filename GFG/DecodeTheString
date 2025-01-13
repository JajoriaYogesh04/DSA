//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        
out.println("~");
}
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<Integer> num= new Stack<>();
        Stack<Character> str= new Stack<>();
        int n= s.length();
        for(int i=0; i<n; i++){
            int count= 0;
            char ch= s.charAt(i);
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