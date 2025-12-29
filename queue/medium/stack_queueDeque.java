
import java.util.*;

// package queue.medium;

public class stack_queueDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        Deque<Integer> queue = new LinkedList<>();
        //12345 -> 54321
        System.out.println("Implementing stack using deque");

        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        stack.addLast(4);
        stack.addLast(5);

        while(!stack.isEmpty()){
            System.out.print(stack.removeLast()+" ");
        }
        System.out.println();

        System.out.println("Implementing queue using deque");

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        queue.addLast(5);

        while(!queue.isEmpty()){
            System.out.print(queue.removeFirst()+" ");
        }
        System.out.println();


    }
}
