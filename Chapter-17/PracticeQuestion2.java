import java.util.*;
public class PracticeQuestion2 {
    public static int majorityEle(int arr[], int start, int end){
        // int mid= start+(end-start)/2;
        if(start==end){
            return arr[start];
        }
        
        int mid= start+(end-start)/2;
        int left= majorityEle(arr, start, mid);
        int right= majorityEle(arr, mid+1, end);
        if(left==right){
            return left;
        }
        int leftCount= countInRange(arr, left, start, end);
        int rightCount= countInRange(arr, right, start, end);
        if(leftCount>rightCount){
            return left;
        }
        return right;
    }
    public static int countInRange(int arr[], int num, int si, int ei){
        int count=0;
        for(int i=si; i<ei; i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void inputArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter: ");
            arr[i]= sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length= sc.nextInt();
        int nums[]= new int[length];
        inputArray(nums);
        System.out.println(majorityEle(nums, 0, nums.length-1));
    }
}