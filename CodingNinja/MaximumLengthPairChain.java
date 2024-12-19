import java.util.*;

public class Solution {
    public static int maxLengthChain(int[][] p, int n) {
        // Write your code here.
        Arrays.sort(p, Comparator.comparingDouble(o->o[1]));
        int length= 1;
        int lastend= p[0][1];
        for(int i=1; i<n; i++){
            if(p[i][0]>lastend){
                length++;
                lastend= p[i][1];
            }
        }
        return length;
    }
}