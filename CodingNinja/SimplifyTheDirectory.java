import java.util.*;
public class Solution {
	public static String simplifyDirectory(String str) {
		// write your code here
		Stack<String> s= new Stack<>();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='/'){
				continue;
			}
			String temp= "";
			while(i<str.length() && str.charAt(i)!='/'){
				temp+=str.charAt(i);
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
		String res="";
		if(s.isEmpty()){
			res="/";
		}
		while(!s.isEmpty()){
			res="/"+s.pop()+res;
		}
		return res;
	}

}
