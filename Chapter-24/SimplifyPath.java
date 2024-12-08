import java.util.*;
public class SimplifyPath {
    public static String toString(Stack<String> s, String res){
        if(s.isEmpty()){
            res= "/";
        }
        while(!s.isEmpty()){
            res= "/"+s.pop()+res;
        }
        return res;
    }
    public static void printStack(Stack<String> s){
        if(s.isEmpty()){
            return;
        }
        String ch= s.pop();
        System.out.println(ch);
        printStack(s);
        s.push(ch);
    }
    public static void simplifyPath(String path){
        Stack<String> s= new Stack<>();
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            String temp= "";
            while(i<path.length() && path.charAt(i)!='/'){
                temp= temp+path.charAt(i);
                i++;
            }
            if(temp.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else if(!temp.equals(".")){
                s.push(temp);
            }
        }
        // printStack(s);
        String res = "";
        System.out.println(path + "<--->" + toString(s, res));
    }
    public static void main(String args[]){
        // Test Cases
        simplifyPath("/a/./b/../../c/");                // Output: /c
        simplifyPath("/../");                           // Output: /
        simplifyPath("/home/");                         // Output: /home
        simplifyPath("/home//foo/");                    // Output: /home/foo
        simplifyPath("/a/./b/../../c/d/./e/../");       // Output: /c/d
        simplifyPath("/a/../../b/../c//.//");           // Output: /c
        simplifyPath("/a//b////c/d//././/..");          // Output: /a/b/c
        simplifyPath("/...");                           // Output: /...
        simplifyPath("/./.././.././../");               // Output: /
        simplifyPath("/");                              // Output: /
    }
}