import java.util.ArrayList;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i]>=0){
                pos.add(a[i]);
            }
            else{
                neg.add(a[i]);
            }
        }
        int positive= 0;
        int negative= 0;
        for(int i=0; i<a.length; i++){
            if(i%2==0){
                a[i]= pos.get(positive);
                positive++;
            }
            else{
                a[i]= neg.get(negative);
                negative++;
            }
        }
        return a;
    }
}