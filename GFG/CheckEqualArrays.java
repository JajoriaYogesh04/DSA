

// User function Template for Java

class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        int sum1= 0;
        int sum2= 0;
        for(int i=0; i<arr1.length; i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
        }
        return sum1==sum2;
    }
}