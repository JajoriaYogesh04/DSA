import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sorting {
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
        System.out.print("Enter Length: ");
        int len= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        inputArrayList(list, len);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}