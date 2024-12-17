import java.util.*;
public class MaximumOfAllSubarrayOfSizeK{
    public static ArrayList<Integer> maximumOfAllSubarraysOfSizeK(int arr[], int k){
        Deque<Integer> dq= new ArrayDeque<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            while(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                list.add(arr[dq.peekFirst()]);
            }
        }
        return list;
    }
    public static void main(String args[]){
        // int arr[]= {1,2,3,1,4,5,2,3,6};
        // int k= 3;
        // System.out.println(maximumOfAllSubarraysOfSizeK(arr, k));
        // Test Case 1: Given example
        int arr1[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k1 = 3;
        System.out.println("Test Case 1: " + maximumOfAllSubarraysOfSizeK(arr1, k1));
        // Output: [3, 3, 4, 5, 5, 5, 6]

        // Test Case 2: Increasing order
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k2 = 3;
        System.out.println("Test Case 2: " + maximumOfAllSubarraysOfSizeK(arr2, k2));
        // Output: [3, 4, 5, 6, 7, 8]

        // Test Case 3: Decreasing order
        int arr3[] = {8, 7, 6, 5, 4, 3, 2, 1};
        int k3 = 3;
        System.out.println("Test Case 3: " + maximumOfAllSubarraysOfSizeK(arr3, k3));
        // Output: [8, 7, 6, 5, 4, 3]

        // Test Case 4: All elements are the same
        int arr4[] = {5, 5, 5, 5, 5, 5, 5};
        int k4 = 3;
        System.out.println("Test Case 4: " + maximumOfAllSubarraysOfSizeK(arr4, k4));
        // Output: [5, 5, 5, 5, 5]

        // Test Case 5: Small array with k = 1
        int arr5[] = {3, 1, 2, 4};
        int k5 = 1;
        System.out.println("Test Case 5: " + maximumOfAllSubarraysOfSizeK(arr5, k5));
        // Output: [3, 1, 2, 4]

        // Test Case 6: Small array with k equal to array size
        int arr6[] = {2, 1, 3};
        int k6 = 3;
        System.out.println("Test Case 6: " + maximumOfAllSubarraysOfSizeK(arr6, k6));
        // Output: [3]

        // Test Case 7: Edge case with k = 2 and array size = 2
        int arr7[] = {1, 2};
        int k7 = 2;
        System.out.println("Test Case 7: " + maximumOfAllSubarraysOfSizeK(arr7, k7));
        // Output: [2]
    }
}