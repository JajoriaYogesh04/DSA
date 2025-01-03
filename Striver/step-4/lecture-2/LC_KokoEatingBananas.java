class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ei=Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            ei=Math.max(ei, piles[i]);
        }
        int si=1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            long time=0;
            for(int j=0; j<piles.length; j++){
                time+=(long)Math.ceil((double)piles[j]/(double)mi);
            }
            if(time<=h){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}