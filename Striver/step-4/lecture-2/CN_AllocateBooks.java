// import java.util.ArrayList;
// public class Solution {
//     public static boolean countPages(ArrayList<Integer>arr,int m,int pages){
//         int count=1;
//         int sum=0;
//         for(int i=0;i<arr.size();i++){
//             if(arr.get(i)+sum<=pages){
//                 sum+=arr.get(i);
//             }
//             else{
//                 sum=arr.get(i);
//                 count++;
//                 if(count>m) return false;
//             }
//         }
//         return true;
//     }
//     public static int findPages(ArrayList<Integer> arr, int n, int m) {
//         // Write your code here.
//         if(m>n) return -1;
//         int min=Integer.MIN_VALUE;
//         int max=0;
//         for(int i=0;i<arr.size();i++){
//             min=Math.max(arr.get(i),min);
//             max+=arr.get(i);
//         }
//         for(int i=min;i<=max;i++){
//             if(countPages(arr,m,i)){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }



import java.util.ArrayList;
public class Solution {
    public static int countStudents(ArrayList<Integer>arr,int m,int pages){
        int count=1;
        long sum=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+sum<=pages){
                sum+=arr.get(i);
            }
            else{
                sum=arr.get(i);
                count++;
                if(count>m){
                    break;
                }
            }
        }
        return count;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n) return -1;
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<arr.size();i++){
            si=Math.max(arr.get(i),si);
            ei+=arr.get(i);
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countStudents(arr,m,mi)<=m){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}