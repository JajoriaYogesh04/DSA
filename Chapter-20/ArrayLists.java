import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        //ADD
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1, 4);
        System.out.println(list1);
        //GET
        int element= list1.get(1);
        System.out.println(element);
        //REMOVE;
        list1.remove(2);
        System.out.println(list1);
        //SET
        list1.set(2, 5);
        System.out.println(list1);
        //True False
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(3));
        
    }
}
