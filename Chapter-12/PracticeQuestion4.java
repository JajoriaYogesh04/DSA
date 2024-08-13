import java.util.*;
public class PracticeQuestion4 {
    public static boolean isAnagram(char arr[], char brr[]){
        if(arr.length == brr.length){
            // System.out.println("EQUAL");
            Arrays.sort(arr);
            Arrays.sort(brr);
            if(Arrays.equals(arr, brr)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1= sc.next();
        System.out.print("Enter Second String: ");
        String str2= sc.next();

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        
        char strArr1[]= str1.toCharArray();
        char strArr2[]= str2.toCharArray();

        if(isAnagram(strArr1, strArr2)){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NOT ANAGRAM");
        }

    }
}