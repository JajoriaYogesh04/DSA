//BRUTE FORCE

// public class Solution {
//     public static int[] findMissingRepeatingNumbers(int []a) {
//         // Write your code here
//         int rep= -1;
//         int mis= -1;
//         for(int i=1; i<=a.length; i++){
//             int count= 0;
//             for(int j=0; j<a.length; j++){
//                 if(a[j]==i){
//                     count++;
//                 }
//             }
//             if(count==2){
//                 rep= i;
//             }
//             else if(count==0){
//                 mis= i;
//             }
//             if(count==2 && mis==0){
//                 break;
//             }
//         }
//         return new int[]{rep, mis};
//     }
// }


//BETTER APPROACH

public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n= a.length;
        int arr[]= new int[n+1];
        for(int i=0; i<n; i++){
            arr[a[i]]++;
        }
        int rep= -1;
        int mis= -1;
        for(int i=1; i<=n; i++){
            if(arr[i]==2){
                rep= i;
            }
            else if(arr[i]==0){
                mis= i;
            }
            if(rep!=-1 && mis!=-1){
                break;
            }
        }
        return new int[]{rep, mis};
    }
}