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


//LEETCODE 
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }
}