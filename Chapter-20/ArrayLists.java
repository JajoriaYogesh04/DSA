import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        
        //Operations
        // //ADD
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(1, 4);
        // System.out.println(list1);
        // //GET
        // int element= list1.get(1);
        // System.out.println(element);
        // //REMOVE;
        // list1.remove(2);
        // System.out.println(list1);
        // //SET
        // list1.set(2, 5);
        // System.out.println(list1);
        // //True False
        // System.out.println(list1.contains(1));
        // System.out.println(list1.contains(3));
        
        //Size
        ArrayList<Integer> list4= new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        System.out.println(list4);
        System.out.println(list4.size());
        for(int i=0; i<list4.size(); i++){
            System.out.print(list4.get(i)+" ");
        }
    }
}
