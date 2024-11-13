import java.util.*;
public class Solution {
    public static int majorityElement(int []arr) {
        // Write your code here
        int ele= arr[0];
        int count= 0;
        for(int i=0; i<arr.length; i++){
            if(count==0){
                ele= arr[i];
            }
            if(arr[i]==ele){
                count++;
            }
            else{
                count --;
            }
        }
        int majority= 0;
        count= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                count++;
            }
            if(count>arr.length/2){
                majority= ele;
                break;
            }
        }
        return majority;
    }
}