import java.util.*;
public class MinimumAbsoluteDifferencePair{
    public static int minimumAbsoluteDifferencePair(int arr[], int brr[]){
        Arrays.sort(arr);
        Arrays.sort(brr);
        int minsum= 0;
        for(int i=0; i<arr.length; i++){
            minsum+=Math.abs(arr[i]-brr[i]);
        }
        return minsum;
    }
    public static void main(String args[]){
        // Test Case 1: Example case
        int arr1[] = {4, 1, 8, 7};
        int brr1[] = {2, 3, 5, 6};
        System.out.println("Test Case 1: " + minimumAbsoluteDifferencePair(arr1, brr1)); // Expected: 6

        // Test Case 2: Already sorted arrays
        int arr2[] = {1, 2, 3, 4};
        int brr2[] = {1, 2, 3, 4};
        System.out.println("Test Case 2: " + minimumAbsoluteDifferencePair(arr2, brr2)); // Expected: 0

        // Test Case 3: Arrays with all elements the same
        int arr3[] = {5, 5, 5};
        int brr3[] = {5, 5, 5};
        System.out.println("Test Case 3: " + minimumAbsoluteDifferencePair(arr3, brr3)); // Expected: 0

        // Test Case 4: Arrays with different ranges
        int arr4[] = {10, 20, 30};
        int brr4[] = {1, 2, 3};
        System.out.println("Test Case 4: " + minimumAbsoluteDifferencePair(arr4, brr4)); // Expected: 54

        // Test Case 5: Arrays with negative and positive values
        int arr5[] = {-1, -2, -3, -4};
        int brr5[] = {1, 2, 3, 4};
        System.out.println("Test Case 5: " + minimumAbsoluteDifferencePair(arr5, brr5)); // Expected: 20

        // Test Case 6: Arrays with one element each
        int arr6[] = {7};
        int brr6[] = {3};
        System.out.println("Test Case 6: " + minimumAbsoluteDifferencePair(arr6, brr6)); // Expected: 4

        // Test Case 7: Arrays with duplicate values
        int arr7[] = {1, 2, 2, 3};
        int brr7[] = {3, 3, 2, 1};
        System.out.println("Test Case 7: " + minimumAbsoluteDifferencePair(arr7, brr7)); // Expected: 4
    }
}