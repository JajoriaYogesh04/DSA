import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		if(N==0){
			return 0;
		}
		int si=1;
		int ei=(int)N;
		while(si<=ei){
			long mi= si+(ei-si)/2;
			if(mi*mi<=N){
				si=(int)(mi+1);
			}
			else{
				ei=(int)(mi-1);
			}
		}
		return ei;
	}
}
