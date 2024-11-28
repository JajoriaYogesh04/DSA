import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		int leader= Integer.MIN_VALUE;
		ArrayList<Integer> ls= new ArrayList<>();
		for(int i=n-1; i>=0; i--){
			if(elements.get(i)>leader){
				ls.add(elements.get(i));
				leader= elements.get(i);
			}
		}
		int start= 0;
		int end= ls.size()-1;
		while(start<end){
			int temp= ls.get(start);
			ls.set(start, ls.get(end));
			ls.set(end, temp);
			start++;
			end--;
		}
		return ls;
	}
}