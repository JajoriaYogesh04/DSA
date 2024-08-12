import java.util.*;
public class PracticeQuestion4 {
    public static void isAnagram(char arr[], char brr[]){
        if(arr.length == brr.length){
            System.out.println("EQUAL");
            Arrays.sort(arr);
            Arrays.sort(brr);
            if(Arrays.equals(arr, brr)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not Equal");
        }
    }
    public static void main(String args[]){
        String str1= "dbca";
        String str2= "bcAda";

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        
        char strArr1[]= str1.toCharArray();
        char strArr2[]= str2.toCharArray();

        isAnagram(strArr1, strArr2);

    }
}