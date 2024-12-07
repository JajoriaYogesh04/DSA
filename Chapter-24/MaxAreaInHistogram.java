import java.util.*;
public class MaxAreaInHistogram {
    public static int[] nextSmallRight(int arr[]){
        int n= arr.length;
        int nsr[]= new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]= n;
            }
            else{
                nsr[i]= s.peek();
            }
            s.push(i);
        }
        return nsr;
    }
    public static int[] nextSmallLeft(int arr[]){
        int n= arr.length;
        int nsl[]= new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }
            else{
                nsl[i]= s.peek();
            }
            s.push(i);
        }
        return nsl;
    }
    public static int maxAreaInHistogram(int heights[]){
        int max= 0;
        int nsl[]= nextSmallLeft(heights);
        int nsr[]= nextSmallRight(heights);
        for(int i=0; i<heights.length; i++){
            int area= heights[i]*(nsr[i]-nsl[i]-1);
            if(area>max){
                max= area;
            }
        }
        return max;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int heights[]= {2,1,5,6,2,3};
        int maxArea= maxAreaInHistogram(heights);
        System.out.println("Max Area in Histogram: "+maxArea);
    }
}