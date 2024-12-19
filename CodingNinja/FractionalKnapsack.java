import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
			double ratio[][]= new double[n][2];
			for(int i=0; i<n; i++){
				ratio[i][0]= i;
				ratio[i][1]= (double)items[i].value/items[i].weight;
			}
			Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
			double maxval= 0;
			for(int i=n-1; i>=0; i--){
				int idx= (int)ratio[i][0];
				if(w>=items[idx].weight){
					maxval+= (double)items[idx].value;
					w-=items[idx].weight;
				}
				else{
					maxval+= ratio[i][1]*w;
					break;
				}
			}
			return maxval;
    }
}
