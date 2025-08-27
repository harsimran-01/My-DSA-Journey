

public class detectingCycle {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    //Floyd's CFA or Tortise and hare approach
    public boolean detectCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        detectingCycle list = new detectingCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;


        System.out.println("Cycle detected: " + list.detectCycle());

    }
}
