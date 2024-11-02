import java.util.Scanner;
import java.util.ArrayList;
public class BeautifulArrayList {
    public static ArrayList<Integer> beautifulArrayList(int n){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        for(int i=2; i<=n; i++){
            ArrayList<Integer> temp= new ArrayList<>();
            for(Integer e: list){
                if(2*e<=n){
                    temp.add(e*2);
                }
            }
            for(Integer e: list){
                if((2*e)-1<=n){
                    temp.add((e*2)-1);
                }
            }
            list= temp;
        }
        return list;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();
        System.out.println(beautifulArrayList(n));
    }
}