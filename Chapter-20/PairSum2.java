import java.util.Scanner;
import java.util.ArrayList;
public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int li= 0, ri= 0;
        int n= list.size();
        for(int i= 0; i<n; i++){
            if(list.get(i)>list.get(i+1)){
                ri= i;
                break;
            }
        }
        li= ri+1;
        while(li!=ri){
            // if(ri==0){
            //     ri= list.size()-1;
            // }
            // if(li==list.size()-1){
            //     li= 0;
            // }
            if(list.get(li)+list.get(ri)==target){
                return true;
            }
            if(list.get(li)+list.get(ri)<target){
                li= (li+1)%n;
            }
            else if(list.get(li)+list.get(ri)>target){
                ri= (ri+n-1)%n;
            }
        }
        return false;
    }
    public static void inputArrayList(ArrayList<Integer>list, int n){
        Scanner sc= new Scanner(System.in);
        for(int i= 0; i<n; i++){
            System.out.print("Enter: ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();             //Rotated Sorted
        System.out.print("Enter Length: ");
        int len= sc.nextInt();
        inputArrayList(list, len);
        System.out.print("Enter Target: ");
        int target= sc.nextInt();
        System.out.println(pairSum(list, target));
    }
}