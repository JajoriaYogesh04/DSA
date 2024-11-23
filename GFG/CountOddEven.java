

// User function Template for Java

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd=0;
        int even= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new int[] {odd, even};
    }
}