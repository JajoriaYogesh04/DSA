

class Solution{
    static long factorial(int N){
        // code here
        if(N==0 || N==1){
            return (long)1;
        }
        return N*factorial(N-1);
    }
}