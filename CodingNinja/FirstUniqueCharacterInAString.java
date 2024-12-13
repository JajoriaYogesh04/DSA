import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Character> firstNonRepeating(String stream) {
		// Write your code here
		int arr[]= new int[26];
		Queue<Character> q= new LinkedList<>();
		ArrayList<Character> ch= new ArrayList<>();
		for(int i=0; i<stream.length(); i++){
			q.add(stream.charAt(i));
			arr[stream.charAt(i)-'a']++;
			while(!q.isEmpty() && arr[q.peek()-'a']>1){
				q.remove();
			}
			if(q.isEmpty()){
				continue;
			}
			else{
				ch.add(q.peek());
			}
		}
		return ch;
	}
}
