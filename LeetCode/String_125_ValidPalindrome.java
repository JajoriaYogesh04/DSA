class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder("");
        s= s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            int val= (int)s.charAt(i);
            if((val>=48 && val<=57)||(val>=65 && val<=90)||(val>=97 && val<=122)){
                sb.append(s.charAt(i));
            }
        }
        s= sb.toString();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}