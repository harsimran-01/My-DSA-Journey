


public class mergeSort {

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

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        //find middle
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        //merge sort left and right
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        //merge sort
        return merge(newLeft, newRight);

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
        mergeSort sort = new mergeSort();
        sort.addFirst(0);
        sort.addFirst(3);
        sort.addFirst(10);
        sort.addFirst(2);
        sort.addFirst(8);
        sort.addFirst(1);

        sort.printingLL();
        sort.head = sort.mergesort(sort.head);
        sort.printingLL();


        



    }
}
