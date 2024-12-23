public class SplitArrayIntoKSubarrays{
    public static int splitArrayIntoKSubarrays(int arr[], int k){
        if(k>arr.length){
            return -1;
        }
        int low= Integer.MIN_VALUE;
        int high= 0; 
        for(int i=0; i<arr.length; i++){
            high+=arr[i];
            low= Math.max(low, arr[i]);
        }
        for(int i=low; i<=high; i++){
            if(countSubarrays(arr,i)==k){
                return i;
            }
        }
        return low;
    }
    public static int countSubarrays(int arr[], int total){
        int subarrayCount= 1;
        long sum= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+sum<=total){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                subarrayCount++;
            }
        }
        return subarrayCount;
    }
    public static void main(String args[]){
        int arr1[] = {5, 1, 3, 7};
        int k1 = 2;
        System.out.println("Test Case 1: " + splitArrayIntoKSubarrays(arr1, k1)); // Expected output: 9

        int arr2[] = {1, 2, 3, 4};
        int k2 = 3;
        System.out.println("Test Case 2: " + splitArrayIntoKSubarrays(arr2, k2)); // Expected output: 4

        int arr3[] = {10, 20, 30, 40, 50};
        int k3 = 2;
        System.out.println("Test Case 3: " + splitArrayIntoKSubarrays(arr3, k3)); // Expected output: 90

        int arr4[] = {1, 2, 3, 4, 5};
        int k4 = 2;
        System.out.println("Test Case 4: " + splitArrayIntoKSubarrays(arr4, k4)); // Expected output: 9

        int arr5[] = {1, 1, 1, 1, 1};
        int k5 = 5;
        System.out.println("Test Case 5: " + splitArrayIntoKSubarrays(arr5, k5)); // Expected output: 1

        int arr6[] = {10, 20, 30, 40};
        int k6 = 4;
        System.out.println("Test Case 6: " + splitArrayIntoKSubarrays(arr6, k6)); // Expected output: 40
    }
}