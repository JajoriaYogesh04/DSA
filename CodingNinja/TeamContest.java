public class Solution {
    public static void merge(int arr[], int si, int mi, int ei){
        int temp[]= new int[ei-si+1];
        int i=si;
        int j= mi+1;
        int k= 0;
        while(i<=mi && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]= arr[i];
                i++;
                k++;
            }
            else{
                temp[k]= arr[j];
                j++;
                k++;
            }
        }
        while(i<=mi){
            temp[k]= arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0; l<temp.length; l++){
            arr[l+si]= temp[l];
        }
    }
    public static int countPairs(int arr[], int si, int mi, int ei){
        int right= mi+1;
        int count=0;
        for(int left=si; left<=mi; left++){
            while(right<=ei && arr[left]>2*arr[right]){
                right++;
            }
            count+=(right-(mi+1));
        }
        return count;
    }
    public static int mergeSort(int arr[], int start, int end){
        int count=0;
        if(start>=end){
            return count;
        }
        int mid= start+(end-start)/2;
        count+=mergeSort(arr, start, mid);
        count+=mergeSort(arr, mid+1, end);
        count+= countPairs(arr, start, mid, end);
        merge(arr, start, mid, end);
        return count;
    }
    public static int team(int []skill, int n){
        // Write your code here.
        return mergeSort(skill, 0, n-1);
    }
}