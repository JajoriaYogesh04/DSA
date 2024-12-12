import java.util.*;
public class QueueJCF{  
    public static void main(String args[]){
        // Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Remove: "+q.remove());
        q.add(4);
        System.out.println("Remove: "+q.remove());
        q.add(5);
        System.out.print("Queue: ");
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}