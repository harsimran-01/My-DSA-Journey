import java.util.LinkedList;

public class collectionsFramework {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();

        //adding elements
        list.add(1);
        list.addFirst(0);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);

        //removing elements
        list.remove();
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
