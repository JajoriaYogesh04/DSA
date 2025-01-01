class Solution {
    public int mySqrt(int x) {
        int si=0;
        int ei=x;
        while(si<=ei){
            long mi=si+(ei-si)/2;
            if(mi*mi<=x){
                si=(int)(mi+1);
            }
            else{
                ei=(int)(mi-1);
            }
        }
        return ei;
    }
}