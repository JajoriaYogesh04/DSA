import java.util.* ;
import java.io.*; 

public class Solution {

    public static int balancedStringSplit(String s) {
   		// Write your code herr
        int l= 0;
        int r= 0;
        int count= 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                l++;
            }
            else if(s.charAt(i)=='R'){
                r++;
            }
            if(l==r){
                count++;
            }
        }
        return count;
    }
    
}