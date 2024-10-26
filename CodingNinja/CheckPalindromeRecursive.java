public class Solution {
    public static boolean palindrome(String str, int li, int ri){
        if(li>=ri){
            return true;
        }
        if(str.charAt(li)!=str.charAt(ri)){
            return false;
        }
        return palindrome(str, li+1, ri-1);
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return palindrome(str, 0, str.length()-1);
    }
}
