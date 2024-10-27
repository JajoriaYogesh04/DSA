import java.util.*;
import java.util.Scanner;
public class PairSum1 {
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
    public static void inputArrayList(ArrayList<Integer>list, int n){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter: ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        System.out.print("Enter Length: ");
        int len= sc.nextInt();
        inputArrayList(list, len);
        System.out.print("Enter Target: ");
        int target= sc.nextInt();
        // System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target));
    }
}