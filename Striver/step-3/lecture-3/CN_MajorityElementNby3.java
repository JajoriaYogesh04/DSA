import java.util.*;
public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        ArrayList<Integer> list= new ArrayList<>();
        int n= v.length;
        for(int i=0; i<n; i++){
            if(list.size()==0 || list.get(0)!= v[i]){
                int count= 0;
                for(int j=0; j<n; j++){
                    if(v[j]==v[i]){
                        count++;
                    }
                }
                if(count>(n/3)){
                    list.add(v[i]);
                }
            }
            if(list.size()==2){
                break;
            }
        }
        return list;
    }
}