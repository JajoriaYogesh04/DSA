class Solution {
    public String simplifyPath(String path) {
        Stack<String> s= new Stack<>();
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            String temp="";
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
        String res= "";
        if(s.isEmpty()){
            res="/";
        }
        while(!s.isEmpty()){
            res= "/"+s.pop()+res;
        }
        return res;
    }
}