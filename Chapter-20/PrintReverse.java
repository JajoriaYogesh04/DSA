import java.util.*;
public class PrintReverse {
    public static void main(String args[]){
        ArrayList<Integer> list4= new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        for(int i=list4.size()-1; i>=0; i--){
            System.out.print(list4.get(i)+" ");
        }
    }
}