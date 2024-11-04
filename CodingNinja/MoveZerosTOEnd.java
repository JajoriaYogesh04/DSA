public class Solution {
    public static int[] moveZeros(int n, int []arr) {
    // Write your code here.
    int j= -1;
    for(int i=0; i<n; i++){
        if(arr[i]==0){
            j=i;
            break;
        }
    }
    if(j==-1){
        return arr;
    }
    for(int i=j+1; i<n; i++){
        if(arr[i]!=0){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j++;
        }
    }
    return arr;
}
}