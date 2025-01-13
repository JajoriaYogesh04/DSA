

//User function Template for Java

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int si= 0;
        int ei= N-1;
        int lb= N;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(Arr[mi]>=k){
                lb= mi;
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return lb;
    }
}