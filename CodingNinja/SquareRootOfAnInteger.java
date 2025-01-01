import java.util.* ;
import java.io.*; 
public class Solution
{
public static int squareRoot(int a)
    {
        // Write your code here.
        int si=0;
        int ei=a;
        while(si<=ei){
            long mi=si+(ei-si)/2;
            if(mi*mi<=a){
                si=(int)(mi+1);
            }
            else{
                ei=(int)(mi-1);
            }
        }
        return ei;
    }
}
