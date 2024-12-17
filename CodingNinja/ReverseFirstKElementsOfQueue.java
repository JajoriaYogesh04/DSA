import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k) 
  {
    // Write your code here.
    int n= q.size();
    Stack<Integer> s= new Stack<>();
    for(int i=0; i<k; i++){
      s.push(q.remove());
    }
    while(!s.isEmpty()){
      q.add(s.pop());
    }
    for(int i=0; i<n-k; i++){
      q.add(q.remove());
    }
    return q;
  }
}