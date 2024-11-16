

class Solution{
    static int isPrime(int N){
        // code here
        if(N<2){
            return 0;
        }
        else if(N==2){
            return 1;
        }
        else if(N%2==0){
            return 0;
        }
        for(int i=3; i*i<=N; i+=2){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
}