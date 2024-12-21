public class KthLargetOddNumberInRange{
    public static int kthLargestOddNumberInGivenRange(int l, int r, int k){
        int lgodd= 0;
        if(k<=0){
            return 0;
        }
        if((r&1)>0){                  //odd
            int count= (int)Math.ceil(((r-l+1)/2)+((r-l+1)%2));
            if(k>count){
                return 6;
            }
            else{
                return (r-(2*k)+2);
            }    
        }
        else{                       //even
            int count= (r-l+1)/2;
            if(k>count){
                return 0;
            }
            else{
                return r-(2*k)+1; 
            }
        }
    }
    public static void main(String args[]){
        // Test cases
        System.out.println(kthLargestOddNumberInGivenRange(1, 5, 2)); // Output: 3
        System.out.println(kthLargestOddNumberInGivenRange(-5, 5, 1)); // Output: 5
        System.out.println(kthLargestOddNumberInGivenRange(-5, 5, 4)); // Output: -1
        System.out.println(kthLargestOddNumberInGivenRange(-5, 5, 6)); // Output: -5 (k > total odd numbers)
        System.out.println(kthLargestOddNumberInGivenRange(-10, -1, 3)); // Output: -5
        System.out.println(kthLargestOddNumberInGivenRange(-10, -2, 1)); // Output: -3
        System.out.println(kthLargestOddNumberInGivenRange(0, 0, 1)); // Output: 0 (no odd numbers)
        System.out.println(kthLargestOddNumberInGivenRange(1, 1, 1)); // Output: 1 (single odd number)
        System.out.println(kthLargestOddNumberInGivenRange(10, 20, 3)); // Output: 15
        System.out.println(kthLargestOddNumberInGivenRange(10, 20, 6)); // Output: 0 (k > total odd numbers)
    }
}