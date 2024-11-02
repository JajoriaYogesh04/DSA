class Solution {
    public int mostFrequent(int[] list, int key) {
        int arr[]= new int[1000];
        for(int i=0; i<list.length-1; i++){
            if(list[i]==key){
                arr[list[i+1]-1]++;
            }
        }
        int max= Integer.MIN_VALUE;
        int ans= 0;
        for(int i=0; i<1000; i++){
            if(arr[i]>max){
                max= arr[i];
                ans= i+1;
            }
        }
        return ans;
    }
}