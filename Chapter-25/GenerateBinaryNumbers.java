import java.util.*;
public class GenerateBinaryNumbers{
    public static String[] generateBinaryNumbers(int n){
        Queue<String> q= new LinkedList<>();
        String arr[]= new String[n];
        q.add("1");
        for(int i=0; i<n; i++){
            String top= q.remove();
            arr[i]= top;
            q.add(top+"0");
            q.add(top+"1");
        }
        return arr;
    }
    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // Test case 1: Small value of n
        System.out.println("Test Case 1: n = 2");
        printArray(generateBinaryNumbers(2));

        // Test case 2: n = 5
        System.out.println("Test Case 2: n = 5");
        printArray(generateBinaryNumbers(5));

        // Test case 3: Edge case, n = 1
        System.out.println("Test Case 3: n = 1");
        printArray(generateBinaryNumbers(1));

        // Test case 4: Larger value of n
        System.out.println("Test Case 4: n = 10");
        printArray(generateBinaryNumbers(10));

        // Test case 5: Edge case, n = 0
        System.out.println("Test Case 5: n = 0");
        printArray(generateBinaryNumbers(0)); // This will handle gracefully as no iterations occur.
    }
}