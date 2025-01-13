

class Solution {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int v= X.length-1;
        int h= Y.length-1;
        int hp= 1;
        int vp= 1;
        int cost= 0;
        while(v>=0 && h>=0){
            if(X[v]>=Y[h]){
                cost+=hp*(X[v]);
                v--;
                vp++;
            }
            else{
                cost+=vp*(Y[h]);
                h--;
                hp++;
            }
        }
        while(v>=0){
            cost+=hp*X[v];
            v--;
            vp++;
        }
        while(h>=0){
            cost+=vp*Y[h];
            h--;
            hp++;
        }
        return cost;
    }
}
        