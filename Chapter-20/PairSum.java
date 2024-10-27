import java.util.*;
public class PairSum {
    public static boolean pairSum1(ArrayList<Integer>list, int n){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if((list.get(i)+list.get(j)==n)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean pairSum2(ArrayList<Integer> list, int n){
        int li= 0;
        int ri= list.size()-1;
        while(li<ri){
            if(list.get(li)+list.get(ri)==n){
                return true;
            }
            else if(list.get(li)+list.get(ri)<n){
                li++;
            }
            else if(list.get(li)+list.get(ri)>n){
                ri--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        int target= 5;
        // System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target));
    }
}