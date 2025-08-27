
public class zigzag {
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public void addFirst(int data){
        //step 1 - creating new Node
        Node newNode = new Node(data);

        //if list is empty
        if(head == null){
            head = newNode;
            return;
        }

        //step 2 - newnode.next = head
        newNode.next = head;

        //step 3 - head = newNode;
        head = newNode;
    }

    public void zigZag(){
        //mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;


        //reversing

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            if(nextL == null) break;
            right.next =nextL;

            left = nextL;
            right = nextR;

        }


        //alternate merging

    }
    public void printingLL(){
        Node temp = head;

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        zigzag list = new zigzag();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
list.printingLL();
        list.zigZag();
        list.printingLL();
        
    }
}
