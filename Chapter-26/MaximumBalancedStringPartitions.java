import java.util.*;
public class MaximumBalancedStringPartitions{
    public static int maximumBalancedStringPartitions(String str){
        int l= 0;
        int r= 0;
        int count= 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='L'){
                l++;
            }
            else if(str.charAt(i)=='R'){
                r++;
            }
            if(l==r){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        // Test case 1
        String str1 = "LRRRRLLRLLRL";
        System.out.println("Test Case 1: " + str1);
        System.out.println("Maximum Balanced Partitions: " + maximumBalancedStringPartitions(str1));
        
        // Test case 2
        String str2 = "LRLRLR";
        System.out.println("\nTest Case 2: " + str2);
        System.out.println("Maximum Balanced Partitions: " + maximumBalancedStringPartitions(str2));

        // Test case 3 - A string with only one balanced substring
        String str3 = "LRLRLRLRLR";
        System.out.println("\nTest Case 3: " + str3);
        System.out.println("Maximum Balanced Partitions: " + maximumBalancedStringPartitions(str3));

        // Test case 4 - A string with no balanced partition
        String str4 = "LLLLRRRR";
        System.out.println("\nTest Case 4: " + str4);
        System.out.println("Maximum Balanced Partitions: " + maximumBalancedStringPartitions(str4));

        // Test case 5 - Empty string
        String str5 = "";
        System.out.println("\nTest Case 5: " + str5);
        System.out.println("Maximum Balanced Partitions: " + maximumBalancedStringPartitions(str5));
    }
}