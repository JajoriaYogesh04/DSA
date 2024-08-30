import java.util.*;
public class PracticeQuestion4 {
    public static int subStrings(String str, int start,int curr, int end, int count){
        if(start==end){
            return count;
        }
        if(curr==end+2){
            start++;
            curr= start+1;
        }
        // System.out.println("start "+str.substring(start, curr).charAt(0));
        // System.out.println("end "+str.substring(start, curr).charAt(str.substring(start, curr).length()-1));
        if(str.substring(start, curr).charAt(0)==str.substring(start, curr).charAt(str.substring(start, curr).length()-1)){
            count++;
            // System.out.print(count);
        }
        return subStrings(str, start, curr+1, end, count);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        String str= sc.next();
        int start= 0;
        int curr= 1;
        int end= str.length()-1;
        int count= 0;
        System.out.println(subStrings(str, start, curr, end, count));
    }
}