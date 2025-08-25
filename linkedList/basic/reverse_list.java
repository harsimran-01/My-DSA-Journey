import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Iterator;
import java.util.LinkedList;

public class reverse_list {

    //time complexity = O(n^2)
    public static void reverse(LinkedList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }

    //time complexity= O(n)
    public static void reverse2(LinkedList<Integer> list){
        Iterator<Integer> it = list.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+"->");
        }
        System.out.println("null");

    }

    //Iterative approach

    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     ListNode next;

    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Original list");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        System.out.println("Reversing a list");
        reverse(list);
        reverse2(list);


    }
}
