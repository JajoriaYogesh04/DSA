

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int si=0;
        int ei=n;
        while(si<=ei){
            long mi=si+(ei-si)/2;
            if(mi*mi<=n){
                si=(int)(mi+1);
            }
            else{
                ei=(int)(mi-1);
            }
        }
        return ei;
    }
}