import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int n= nums.length;
		Map<Integer, Integer> preSumMap= new HashMap<>();
		int sum= 0;
		int maxLen= 0;
		for(int i=0; i<n; i++){
			sum+=nums[i];
			if(sum==k){
				maxLen= Math.max(maxLen, i+1);
			}
			int rem= sum-k;
			if(preSumMap.containsKey(rem)){
				int len= i-preSumMap.get(rem);
				maxLen= Math.max(maxLen, len);
			}
			if(!preSumMap.containsKey(sum)){
				preSumMap.put(sum, i);
			}
		}
		return maxLen;
	}
}