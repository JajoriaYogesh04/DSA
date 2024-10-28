import java.util.ArrayList;
import java.util.Scanner;
public class MonotonicArrayList {
    public static boolean monotonicArrayList(ArrayList<Integer>list){
        int n= list.size();
        boolean inc= true;
        boolean dec= true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>=list.get(i+1)){
                inc= false;
            }
            if(list.get(n-1-i)>=list.get(n-2-i)){
                dec= false;
            }
        }
        return inc||dec;
    }
    public static void inputArrayList(ArrayList<Integer> list, int n){
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
        System.out.println(monotonicArrayList(list));
    }
}