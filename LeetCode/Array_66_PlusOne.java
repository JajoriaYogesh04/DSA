class Solution {
    public int[] plusOne(int[] digits) {
        // int num= 0;
        // int length= digits.length;
        // boolean inc= true;
        // for(int i=0; i<length; i++){
        //     num= num*10+digits[i];
        //     if(digits[i]!=9){
        //         inc= false;
        //     }
        // }
        // num+=1;
        // if(digits[0]==9){
        //     length+=1;
        // }
        // int arr[]= new int[length];
        // int i=0;
        // while(num>0){
        //     int ld= num%10;
        //     arr[length-1-i]= ld;
        //     i++;
        //     num/=10;
        // }
        // return arr;
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits= new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}