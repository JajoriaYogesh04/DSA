import java.util.*;
public class DecodeAString {
    public static String decodeAString(String encode){
        Stack<Integer> num= new Stack<>();
        Stack<Character> str= new Stack<>();
        int n= encode.length();
        String decode="";
        for(int i=0; i<n; i++){
            char ch= encode.charAt(i);
            if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                num.push(ch-'0');
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
                    String sb= "";
                    int itr= num.pop();
                    for(int j=0; j<itr; j++){
                        sb+=temp;
                    }
                    for(int j=0; j<temp.length()*itr; j++){
                        str.push(sb.charAt(j));
                    }
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
        String encode= "2[a3[b]1[s]]";
        String decode= decodeAString(encode);
        System.out.println(decode);
    }
}