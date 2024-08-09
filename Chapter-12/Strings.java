import java.util.*;
public class Strings{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String ars[]){
        Scanner sc= new Scanner(System.in);

        // char arr[]= {'a', 'b', 'c', 'd'};
        // String str= "abcd";
        // System.out.println(str);
        // String str2= new String("abcd");
        // System.out.println(str2);

        // System.out.print("Enter Word: ");
        // String word= sc.next();
        // System.out.println(word);
        // System.out.print("Enter Sentence: ");
        // String sentence= sc.nextLine();
        // System.out.println(sentence);

        // System.out.println(sentence.length());

        String firstName= "Yogesh";
        String lastName= "Jajoria";
        String fullName= firstName+" "+lastName;
        System.out.println(fullName);

        printLetters(fullName);
    }
}