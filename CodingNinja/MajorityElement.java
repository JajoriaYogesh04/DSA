// approach 1

import java.util.*;
public class Solution {
    public static int majorityElement(int []arr) {
        // Write your code here
        Arrays.sort(arr);
        int len=0;
        int max= 0;
        int ele= arr[0];
        if(arr.length==1){
            return ele;
        }
        if(arr.length==2){
            ele=arr[1];
            return ele;
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                len++;
                if(len>max){
                    max= len;
                    ele= arr[i];
                }
            }
            else{
                len=0;
            }
        }
        return ele;
        
    }
}