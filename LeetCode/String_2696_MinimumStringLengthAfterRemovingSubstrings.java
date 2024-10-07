class Solution {
    public int minLength(String s) {
        int charArray[]= new int[s.length()];
        for(int i=0; i<s.length(); i++){
            charArray[i]= s.charAt(i);
        }
        int write= 0;
        for(int read=0; read<charArray.length; read++){
            charArray[write]= charArray[read];
            if((write>0)&&(charArray[write-1]=='A'||charArray[write-1]=='C')&&(charArray[write]-'A'==(charArray[write-1]-'A'+1))){
                write--;
            } 
            else{
                write++;
            }
        }   
        return write;
    }
}