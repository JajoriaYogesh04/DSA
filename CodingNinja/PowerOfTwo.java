public class Solution {
    public static boolean isPowerOfTwo(int n) {
        // Write your code here.
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==0){
            return isPowerOfTwo(n/2);
        }
        return false;
    }
}