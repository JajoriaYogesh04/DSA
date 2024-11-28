import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

import sun.jvm.hotspot.gc.shared.CollectedHeapName;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int idx= -1;
		int n= permutation.size();
		for(int i=n-2; i>=0; i--){
			if(permutation.get(i)<permutation.get(i+1)){
				idx= i;
				break;
			}
		}
		if(idx==-1){
			Collections.reverse(permutation);
			return permutation;
		}
		for(int i=n-1; i>=idx; i--){
			if(permutation.get(i)>permutation.get(idx)){
				int temp= permutation.get(i);
				permutation.set(i, permutation.get(idx));
				permutation.set(idx, temp);
				break;
			}
		}
		ArrayList<Integer> sl= permutation.subList(idx+1, permutation.size());
		Collections.reverse(sl);
		return permutation;

	}
}

