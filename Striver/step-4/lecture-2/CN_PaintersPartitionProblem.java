import java.util.ArrayList;

public class Solution 
{
    public static int countPainters(ArrayList<Integer> arr,int k,int time){
        int sum=0;
        int count=1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+sum<=time){
                sum+=arr.get(i);
            }
            else{
                sum=arr.get(i);
                count++;
                if(count>k) break;
            }
        }
        return count;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        if(k>boards.size()) return -1;
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<boards.size();i++){
            si=Math.max(si,boards.get(i));
            ei+=boards.get(i);
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countPainters(boards,k,mi)<=k) ei=mi-1;
            else si=mi+1;
        }
        return si;
    }
}