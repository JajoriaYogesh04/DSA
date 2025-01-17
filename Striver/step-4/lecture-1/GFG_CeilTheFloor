

// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor= -1;
        int ceil= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<x){
                floor= Math.max(floor, arr[i]);
            }
            else if(arr[i]>x){
                if(ceil==-1){
                    ceil= arr[i]; 
                }
                else{
                    ceil= Math.min(ceil, arr[i]);   
                }
            }
            else{
                ceil= floor= arr[i];
            }
        }
        return new int[]{floor, ceil};
    }
}