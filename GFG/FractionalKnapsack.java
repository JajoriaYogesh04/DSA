

// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        double ratio[][]= new double[val.size()][2];
        for(int i=0; i<ratio.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= (double)val.get(i)/wt.get(i);
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        double maxval= 0.0;
        for(int i= ratio.length-1; i>=0; i--){
            int idx= (int)ratio[i][0];
            if(capacity>=wt.get(idx)){
                maxval+=(double)val.get(idx);
                capacity-=wt.get(idx);
            }
            else{
                maxval+=capacity*ratio[i][1];
                break;
            }
        }
        return maxval;
    }
}