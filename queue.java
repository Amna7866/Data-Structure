import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>(); 

        queue.offer("simon");
        queue.offer("peter");
        queue.offer("elenna");

        queue.poll();
        System.out.println(queue); 

        System.out.println(queue.isEmpty());
        

        //System.out.println(queue.peek());
        
        
    }
}
