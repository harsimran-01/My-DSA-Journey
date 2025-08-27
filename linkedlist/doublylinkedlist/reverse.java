// package linkedlist.doublylinkedlist;

// package linkedList.doublyLinkedList;

public class reverse {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;

    public void reversef(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void addFirst(int data){
        //creation of NewNode
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printingLL(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        reverse list = new reverse();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.printingLL();

        list.reversef();

        list.printingLL();



    }
}
