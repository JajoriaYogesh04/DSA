import java.util.LinkedList;
public class JavaCollectionFramework{
    public static void main(String args[]){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addLast(1);
        ll.addFirst(2);
        ll.addLast(3);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}