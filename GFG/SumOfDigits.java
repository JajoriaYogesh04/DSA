

// User function Template for Java
class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum= 0;
        while(n>0){
            int ld= n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
}