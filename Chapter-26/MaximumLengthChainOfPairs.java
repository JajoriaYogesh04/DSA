import java.util.*;
public class MaximumLengthChainOfPairs{
    public static int maxLengthChain(int pairs[][]){
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int length= 1;
        int lastEnd= pairs[0][1];
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0]>lastEnd){
                length++;
                lastEnd= pairs[i][1];
            }
        }
        return length;
    }
    public static void main(String args[]){
        // Test cases
        int[][] pairs1 = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.print("Test case 1: ");
        System.out.println(maxLengthChain(pairs1)); // Expected output: 3

        int[][] pairs2 = {{1, 2}, {2, 3}, {3, 4}};
        System.out.print("Test case 2: ");
        System.out.println(maxLengthChain(pairs2)); // Expected output: 2

        int[][] pairs3 = {{10, 20}, {20, 30}, {30, 40}};
        System.out.print("Test case 3: ");
        System.out.println(maxLengthChain(pairs3)); // Expected output: 2

        int[][] pairs4 = {{1, 100}};
        System.out.print("Test case 4: ");
        System.out.println(maxLengthChain(pairs4)); // Expected output: 1

        int[][] pairs6 = {{5, 10}, {1, 2}, {3, 8}, {9, 15}};
        System.out.print("Test case 6: ");
        System.out.println(maxLengthChain(pairs6)); // Expected output: 3
    }
}