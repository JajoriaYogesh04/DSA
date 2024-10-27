public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        while(m%n!=0){
            int hcf= m%n;
            m= n;
            n= hcf;
        }
        return n;
    }
}