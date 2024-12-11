//BRUTE FORCE


// import java.util.ArrayList;
// import java.util.List;
// import java.util.*;

// public class CN_MergeAllOverlapingIntervals {
//     public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
//         // Write your code here.
//         int n= arr.length;
//         List<List<Integer>> list= new ArrayList<>();
//         Arrays.sort(arr, new Comparator<int[]>() {
//             public int compare (int a[], int b[]){
//                 return Integer.compare(a[0], b[0]);
//             }
//         });
//         for(int i=0; i<n; i++){
//             int start= arr[i][0];
//             int end= arr[i][1];
//             if(!list.isEmpty() && end<=list.get(list.size()-1).get(1)){
//                 continue;
//             }
//             for(int j=i+1; j<n; j++){
//                 if(end>=arr[j][0]){
//                     end= Math.max(end, arr[j][1]);
//                 }
//                 else{
//                     break;
//                 }
//             }
//             ArrayList<Integer> el= new ArrayList<>();
//             el.add(start);
//             el.add(end);
//             list.add(el);
//         }
//         return list;
//     }
// }


//OPTIMAL

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CN_MergeAllOverlapingIntervals {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        int n= arr.length;
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare (int a[], int b[]){
                return Integer.compare(a[0], b[0]);
            }
        });
        for(int i=0; i<n; i++){
            ArrayList<Integer> el= new ArrayList<>();
            if(list.isEmpty() || arr[i][0]>list.get(list.size()-1).get(1)){
                el.add(arr[i][0]);
                el.add(arr[i][1]);
                list.add(el);
            }
            else{
                list.get(list.size()-1).set(1, Math.max(list.get(list.size()-1).get(1), arr[i][1]));
            } 
        }
        return list;
    }
}