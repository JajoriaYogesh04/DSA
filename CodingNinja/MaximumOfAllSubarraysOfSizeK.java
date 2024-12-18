import java.util.* ;
import java.io.*; 
public class Solution 
{

    public static ArrayList<Integer> maxOfSubarray(ArrayList<Integer> nums, int n, int k) 
	{
        // Write your code here. 
        Deque<Integer> dq= new ArrayDeque<>();
        ArrayList<Integer> result= new ArrayList<>();
        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && nums.get(i)>nums.get(dq.peekLast())){
                dq.removeLast();
            }
            while(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            dq.add(i);
            if(i>=k-1){
                result.add(nums.get(dq.peekFirst()));
            }
        }
        return result;
    }

}