

// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n= arr.length+1;
        int sum= 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int total= (n*(n+1))/2;
        return total-sum;
    }
}