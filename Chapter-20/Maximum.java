import java.util.*;
public class Maximum {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int len= sc.nextInt();
        for(int i=0; i<len; i++){
            System.out.print("Enter: ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int max= Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}