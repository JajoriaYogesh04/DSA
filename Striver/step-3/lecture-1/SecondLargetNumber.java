public class Solution {
    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min2= Integer.MAX_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>min && arr[i]<min2){
                min2= arr[i];
            }
            if(arr[i]<max && arr[i]>max2){
                max2= arr[i];
            }
        }
        int a[]= new int[2];
        a[0]= max2;
        a[1]= min2;
        return a;
    }
}