// import java.util.ArrayList;
// public class Solution {
//     public static int countStudents(ArrayList<Integer>arr,int m,int pages){
//         int count=1;
//         long sum=0;
//         for(int i=0;i<arr.size();i++){
//             if(arr.get(i)+sum<=pages){
//                 sum+=arr.get(i);
//             }
//             else{
//                 sum=arr.get(i);
//                 count++;
//                 if(count>m){
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
//     public static int findPages(ArrayList<Integer> arr, int n, int m) {
//         // Write your code here.
//         if(m>n) return -1;
//         int si=Integer.MIN_VALUE;
//         int ei=0;
//         for(int i=0;i<arr.size();i++){
//             si=Math.max(arr.get(i),si);
//             ei+=arr.get(i);
//         }
//         while(si<=ei){
//             int mi=si+(ei-si)/2;
//             if(countStudents(arr,m,mi)<=m){
//                 ei=mi-1;
//             }
//             else{
//                 si=mi+1;
//             }
//         }
//         return si;
//     }
// }



import java.util.* ;
import java.io.*; 
public class Solution {
    public static int countStudents(ArrayList<Integer>arr,int b,int pages){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+sum<=pages){
                sum+=arr.get(i);
            }
            else{
                sum=arr.get(i);
                count++;
                if(count>b){
                    break;
                }
            }
        }
        return count;
    }
    public static int allocateBooks(ArrayList<Integer> pages,int n ,int b) {
        // Write your code here.
        if(b>n)return -1;
        int si=Integer.MIN_VALUE;
        int ei=0;
        for(int i=0;i<n;i++){
            si=Math.max(si,pages.get(i));
            ei+=pages.get(i);
        }
        while(si<=ei){
            int mi=si+(ei-si)/2;
            if(countStudents(pages,b,mi)<=b){
                ei=mi-1;
            }
            else{
                si=mi+1;
            }
        }
        return si;
    }
}
