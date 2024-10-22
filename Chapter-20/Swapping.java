import java.util.*;
public class Swapping {
    public static void swapping(ArrayList<Integer> list, int idx1, int idx2){
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }
    public static void inputArrayList(int n, ArrayList<Integer> list){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter: ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length: ");
        int len= sc.nextInt();
        inputArrayList(len, list);
        System.out.print("Enter Index 1: ");
        int idx1= sc.nextInt();
        System.out.print("Emter Index 2: ");
        int idx2= sc.nextInt();
        swapping(list, idx1, idx2);
    }
}