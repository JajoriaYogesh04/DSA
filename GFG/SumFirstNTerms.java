//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long cube(long n, long sum){
        if(n==1){
            sum+=1;
            return sum;
        }
        sum+=(n*n*n);
        return cube(n-1, sum);
    }
    long sumOfSeries(long n) {
        // code here
        long sum= 0;
        return cube(n, 0);
    }
}