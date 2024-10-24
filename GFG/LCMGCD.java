//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long gcd(Long A, Long B){
        while(B%A != 0){
            Long hcf= B%A;
            B= A;
            A= hcf;
        }
        return A;
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long arr[]= new Long[2];
        Long hcf= gcd(A, B);
        Long lcm= (A*B)/hcf;
        arr[0]= lcm;
        arr[1]= hcf;
        return arr;
    }
};