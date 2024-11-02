import java.util.Scanner;
import java.util.ArrayList;
public class MostFrequentNumberFollowingKey {
    public static int mostFrequentNumberFollowingKey(ArrayList<Integer> list, int key){
        int arr[]= new int[1000];
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)==key){
                arr[list.get(i+1)-1]++;
            }
        }
        int max= Integer.MIN_VALUE;
        int ans= 0;
        for(int i=0; i<1000; i++){
            if(arr[i]>max){
                max= arr[i];
                ans= i+1;
            }
        }
        return ans;
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
        System.out.print("Enter Key: ");
        int key= sc.nextInt();
        System.out.println(mostFrequentNumberFollowingKey(list, key));
    }
}