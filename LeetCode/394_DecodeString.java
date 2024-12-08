class Solution {
    public String decodeString(String s) {
        Stack<Integer> num= new Stack<>();
        Stack<Character> str= new Stack<>();
        String encode= "";
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            int count= 0;
            StringBuilder temp= new StringBuilder("");
            StringBuilder sb= new StringBuilder("");
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
                while(!str.isEmpty() && str.peek()!='['){
                    temp.insert(0, str.pop());
                }
                str.pop();
                count= num.pop();
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
        while(!str.isEmpty()){
            encode= str.pop()+ encode;
        }
        return encode;
    }
}