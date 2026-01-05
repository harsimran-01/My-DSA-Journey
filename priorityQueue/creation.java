
import java.util.Comparator;
import java.util.PriorityQueue;

// package priorityQueue;
public class creation {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(3);
        pq.add(1);
        pq.add(100);
        pq.add(0);

        while(!pq.isEmpty()){
            System.out.print(pq.remove() + " ");
        }
    }
}
