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