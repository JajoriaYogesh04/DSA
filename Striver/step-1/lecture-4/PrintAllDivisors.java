//CodingNinja
public class Solution {
    public static int sumOfAllDivisors(int n){
        int sumArr[]= new int[n+1];
        for(int i= 1; i<=n; i++){
            for(int j=i; j<=n; j+=i){
                sumArr[j]+=i;
            }
        }
        int totalSum= 0;
        for(int i=1; i<=n; i++){
            totalSum+=sumArr[i];
        }
        return totalSum;
    }
}

//GFG
//GFG
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        long sumArr[]= new long[N+1];
        for(int i= 1; i<=N; i++){
            sumArr[i]= (N/i)*i;
        }
        long totalSum= 0;
        for(int i=1; i<=N; i++){
            totalSum+=sumArr[i];
        }
        return totalSum;
    }
}