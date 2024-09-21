class Solution {
    public int countDigits(int num) {
        int temp= num;
        int count=0;
        while(temp>0){
            int ld= temp%10;
            if(num%ld==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}