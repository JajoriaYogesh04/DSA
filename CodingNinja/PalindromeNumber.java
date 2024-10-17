public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int rev= 0;
        int num= n;
        while(num>0){
            int digit= num%10;
            rev= (rev*10)+digit;
            num/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
}