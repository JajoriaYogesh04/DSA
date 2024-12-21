import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    private static final int MOD= 1000000007;
    public static int boardCutting(ArrayList<Integer> horizontal, ArrayList<Integer> vertical, int m, int n)
    {
        //    Write your code here.
        PriorityQueue<Integer> hor= new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> ver= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<horizontal.size(); i++){
            hor.add(horizontal.get(i));
        }
        for(int j=0; j<vertical.size(); j++){
            ver.add(vertical.get(j));
        }
        int hp= 1;
        int vp= 1;
        long cost= 0;
        while(!hor.isEmpty() && !ver.isEmpty()){
            if(hor.peek()>=ver.peek()){
                cost=(cost+hp*(long)hor.remove())%MOD;
                vp++;
            }
            else{
                cost=(cost+vp*(long)ver.remove())%MOD;
                hp++;
            }
        }
        while(!hor.isEmpty()){
            cost=(cost+hp*(long)hor.remove())%MOD;
        }
        while(!ver.isEmpty()){
            cost=(cost+vp*(long)ver.remove())%MOD;
        }
        return (int)cost;
    }
}