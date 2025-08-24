
public class Constructing_ll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1 - creating new Node
        Node newNode = new Node(data);

        //if list is empty
        if(head == null){
            head = tail = newNode;
        }

        //step 2 - newnode.next = head
        newNode.next = head;

        //step 3 - head = newNode;
        head = newNode;
    }

    public static void main(String[] args) {
        Constructing_ll list = new Constructing_ll();
        list.addFirst(1);
        list.addFirst(2);
    }
    
}
