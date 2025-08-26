public class removingCycle {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
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

    public static Node head;

    public void removeCycle(){

        //detecting cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        //finding the meeting point

        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //removing the cycle

        // prev.next = null;
        if (prev == null) {
        // special case: cycle starts at head
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
    } else {
        prev.next = null;
    }
    }


    public static void main(String[] args) {
        removingCycle list = new removingCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;


        System.out.println("Cycle detected: " + list.detectCycle());
        list.removeCycle();
        System.out.println("Cycle detected: " + list.detectCycle());
        



    }
}
