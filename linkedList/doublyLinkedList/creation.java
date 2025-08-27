public class creation {

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
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //creation of NewNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        //creation of newnode
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp = null;

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
        creation list = new creation();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        list.addLast(4);

        list.removeFirst();

        list.removeLast();

        list.printingLL();

        
    }
}
