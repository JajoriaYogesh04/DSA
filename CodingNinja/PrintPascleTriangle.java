import java.util.*;
public class Solution {
    public static int[] generateRow(int row){
        int arr[]= new int[row];
        int ans= 1;
        arr[0]= ans;
        for(int col=1; col<row; col++){
            ans= ans*(row-col);
            ans= ans/col;
            arr[col]= ans;
        }
        return arr;
    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int arr[][]= new int[N][N];
        for(int row=0; row<N; row++){
            arr[row]= generateRow(row+1);
        }
        return arr;
    }
}