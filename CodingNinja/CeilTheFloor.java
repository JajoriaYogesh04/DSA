import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int si= 0;
      int ei= n-1;
      int lb= -1;
      while(si<=ei){
        int mi= si+(ei-si)/2;
        if(a[mi]<=x){
          lb= a[mi];
          si= mi+1;
        }
        else{
          ei=mi-1;
        }
      }
      int ub= -1;
      si= 0;
      ei= n-1;
      while(si<=ei){
        int mi= si+(ei-si)/2;
        if(a[mi]>=x){
          ub= a[mi];
          ei= mi-1;
        }
        else{
          si= mi+1;
        }
      }
      return new int[]{lb, ub};
    }
    
}