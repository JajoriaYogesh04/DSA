//OPTIMAL 1

// // User function Template for Java

// class Solution {
//     // Function to merge the arrays.
//     public void mergeArrays(int a[], int b[]) {
//         // code here
//         int m= a.length;
//         int n= b.length;
//         int left= m-1;
//         int right= 0;
//         while(left>=0 && right<n){
//             if(a[left]>b[right]){
//                 int temp= a[left];
//                 a[left]= b[right];
//                 b[right]= temp;
//                 left--;
//                 right++;
//             }
//             else{
//                 break;
//             }
//         }
//         Arrays.sort(a);
//         Arrays.sort(b);
//     }
// }




//OPTIMAL 2

// User function Template for Java

class Solution {
    // Function to merge the arrays.
    private void swapArray(int a[], int b[], int m, int n){
        if(a[m]>b[n]){
            int temp= a[m];
            a[m]= b[n];
            b[n]= temp;   
        }
    }
    public void mergeArrays(int a[], int b[]) {
        // code here
        int m= a.length;
        int n= b.length;
        int len= m+n;
        int gap= (len/2)+(len%2);
        while(gap>0){
            int left= 0;
            int right= left+gap;
            while(right<len){
                if(left<m && right>=m){
                    swapArray(a, b, left, right-m);
                }
                else if(left>=m){
                    swapArray(b, b, left-m, right-m);
                }
                else{
                    swapArray(a, a, left, right);
                }
                left++;
                right++;   
            }
            if(gap==1){
                break;
            }
            gap= (gap/2)+(gap%2);
        }
    }
}