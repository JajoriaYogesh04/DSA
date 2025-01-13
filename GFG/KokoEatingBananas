

class Solution {
    public static int kokoEat(int[] arr, int k) {
        // code here
        int ei=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ei){
                ei=arr[i];
            }
        }
        int si=1;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            long time=0;
            for(int i=0; i<arr.length; i++){
                time+=(long)Math.ceil((double)arr[i]/(double)mi);
            }
            if(time<=k){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}