import java.util.*;
public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int left= 0;
        int right= n-1;
        while(left<=right){
            if(book[left]+book[right]==target){
                return "YES";
            }
            else if(book[left]+book[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return "NO";
    }
}