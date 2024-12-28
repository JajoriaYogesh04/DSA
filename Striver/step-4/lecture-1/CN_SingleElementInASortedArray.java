import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int n=arr.size();
        if(n==1){
            return arr.get(0);
        }
        if(!arr.get(0).equals(arr.get(1))){
            return arr.get(0);
        }
        if(!arr.get(n-1).equals(arr.get(n-2))){
            return arr.get(n-1);
        }
        int si=1;
        int ei=n-2;
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(!arr.get(mi).equals(arr.get(mi-1)) && !arr.get(mi).equals(arr.get(mi+1))){
                return arr.get(mi);
            }
            else if((mi%2==1 && arr.get(mi-1).equals(arr.get(mi)))||(mi%2==0 && arr.get(mi).equals(arr.get(mi+1)))){
                si=mi+1;
            }
            else{
                ei=mi-1;
            }
        }
        return -1;
    }
}