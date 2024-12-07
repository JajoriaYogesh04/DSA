import java.util.*;
public class Solution {
    public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.
        int n= nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k= j+1;
                int l= n-1;
                while(k<l){
                    int sum= nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum>target){
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        ArrayList<Integer> quad= new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add(nums[l]);
                        list.add(quad);
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l-1]==nums[l]){
                            l--;
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return list;
    }
}