class Solution {
    public boolean isPossible(int bloomDay[],int mi,int m,int k){
        int count=0;
        int boq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mi){
                count++;
            }
            else{
                boq+=(count/k);
                count=0;
            }
        }
        boq+=(count/k);
        if(boq>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int si=Integer.MAX_VALUE;
        int ei=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            si=Math.min(si,bloomDay[i]);
            ei=Math.max(ei,bloomDay[i]);
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(isPossible(bloomDay,mi,m,k)){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}