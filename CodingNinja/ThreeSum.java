import java.util.*;
public class Solution {
    public static List< List < Integer > > triplet(int n, int []arr) {
        // Write your code here.
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j= i+1;
            int k= n-1;
            while(j<k){
                int sum= arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    ArrayList<Integer> trip= new ArrayList<>();
                    trip.add(arr[i]);
                    trip.add(arr[j]);
                    trip.add(arr[k]);
                    list.add(trip);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k-1]){
                        k--;
                    }
                }
            }
        }
        return list;
    }
}