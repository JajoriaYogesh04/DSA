class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0; 
        int j=0;
        int k=0;
        int tempArr[]= new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                tempArr[k]= nums1[i];
                i++;
            }
            else{
                tempArr[k]= nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            tempArr[k]= nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            tempArr[k]= nums2[j];
            j++;
            k++;
        }
        int length= tempArr.length;
        if(length%2==1){
            return (double)tempArr[((length+1)/2)-1];
        }
        else{
            return (double)(tempArr[(length/2)-1]+tempArr[((length/2)+1)-1])/2;
        }
    }
}