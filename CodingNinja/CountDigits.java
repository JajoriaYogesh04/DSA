public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count= 0;
        int num= Math.abs(n);
        while(num>0){
            int digit= num%10;
            if((digit!=0)&&(n%digit==0)){
                count++;
            }
            num/=10;
        }
        return count;
    }
}