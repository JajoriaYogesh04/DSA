import java.util.*;
public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        ArrayList<Integer> list= new ArrayList<>();
        int n= v.length;
        int count1= 0;
        int count2= 0;
        int el1= 0;
        int el2= 0;
        for(int i=0; i<n; i++){
            if(count1==0 && v[i]!=el2){
                count1= 1;
                el1= v[i];
            }
            else if(count2==0 && v[i]!=el1){
                count2= 1;
                el2= v[i];
            }
            else if(v[i]==el1){
                count1++;
            }
            else if(v[i]==el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1= 0;
        count2= 0;
        for(int i=0; i<n; i++){
            if(v[i]==el1){
                count1++;
            }
            if(v[i]==el2){
                count2++;
            }
        }
        int mini= n/3;
        if(count1>mini){
            list.add(el1);
        }
        if(count2>mini){
            list.add(el2);
        }
        return list;
    }
}