public class Solution {
    public static void fib(int n, int arr[]) {
        if(n > 0) arr[0] = 0;
        if(n > 1) arr[1] = 1;
        for(int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
    public static int[] generateFibonacciNumbers(int n) {
        if (n == 0) return new int[0]; 
        int arr[] = new int[n];
        fib(n, arr); 
        return arr;
    }
}
