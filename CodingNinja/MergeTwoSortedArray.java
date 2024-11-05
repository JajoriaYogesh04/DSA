import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        ArrayList<Integer> list= new ArrayList<>();
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]== b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}