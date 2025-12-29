
import java.util.Deque;
import java.util.LinkedList;

// package queue.medium;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        // int first = deque.getFirst();
        // System.out.println(first);
        // int last = deque.getLast();
        // System.out.println(last);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println(deque);
        int first = deque.getFirst();
        System.out.println(first);
        int last = deque.getLast();
        System.out.println(last);
    }
}
