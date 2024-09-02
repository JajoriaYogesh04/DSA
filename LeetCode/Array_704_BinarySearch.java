public class Array_704_BinarySearch {
    public static int search(int[] nums, int target) {
        int si=0;
        int ei= nums.length-1;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                si= mid+1;
            }
            else{
                ei= mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]= {-1,0,3,5,9,12};
        int target= 9;
        System.out.println(search(nums, target));
    }
}