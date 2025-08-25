//Tortoise Hare Method

public class middle_of_LinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public Node middleENode(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {

        middle_of_LinkedList middle = new middle_of_LinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(10);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(middle.middleENode().data);
        
    }
}
