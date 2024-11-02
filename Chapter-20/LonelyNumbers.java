import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class LonelyNumbers {
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list){
        ArrayList<Integer> result= new ArrayList<>();
        int n= list.size();
        if(n==1){
            result.add(list.get(0));
            return result;
        }
        Collections.sort(list);
        if(list.get(0)+1!=list.get(1) && list.get(0)!=list.get(1)){
            result.add(list.get(0));
        }
        if(list.get(n-1)-1!=list.get(n-2) && list.get(n-1)!=list.get(n-2)){
            result.add(list.get(n-1));
        }
        for(int i=1; i<=n-2; i++){
            int curr= list.get(i);
            if(curr-1!=list.get(i-1)&&curr+1!=list.get(i+1)&&curr!=list.get(i-1)&&curr!=list.get(i+1)){
                result.add(curr);
            }
        }
        return result;
    }
    public static void inputArrayList(ArrayList<Integer> list, int n){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter: ");
            list.add(sc.nextInt());
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        System.out.print("Enter Length: ");
        int len= sc.nextInt();
        inputArrayList(list, len);
        System.out.println(list);
        System.out.println(lonelyNumbers(list));
    }
}