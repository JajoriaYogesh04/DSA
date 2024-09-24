public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        
        int si= 0;
        int ei= arr.length-1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==target){
                return mi;
            }
            else if(target>=arr[si] && target<arr[mi]){
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        } 
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7};
        int target= 5;
        System.out.println(binarySearch(arr, target));
    }
}