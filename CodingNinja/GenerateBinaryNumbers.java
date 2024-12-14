import java.util.* ;
import java.io.*; 

public class Solution {

    public static List<String> generateBinaryNumbers(int n) {
        //Write your code here
        List<String> list= new LinkedList<>();
        Queue<String> q= new LinkedList<>();
        q.add("1");
        for(int i=0; i<n; i++){
            String top= q.remove();
            list.add(top);
            q.add(top+"0");
            q.add(top+"1");
        }
        return list;
    }

}
