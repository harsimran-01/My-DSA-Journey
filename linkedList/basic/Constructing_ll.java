
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
    public static int size;


    public void addFirst(int data){
        //step 1 - creating new Node
        Node newNode = new Node(data);
        size++;

        //if list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - newnode.next = head
        newNode.next = head;

        //step 3 - head = newNode;
        head = newNode;
    }
    public void addLast(int data){
        //step 1 - creating new Node
        Node newNode = new Node(data);
        size++;

        //if list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - tail.next = newnode
        tail.next = newNode;

        //step 3 - tail = newnode
        tail = newNode;
    }

    public void addMiddle(int indx,int data){
        //creating newnode
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<indx-1){
            temp = temp.next;
            i++;
        }

        //when the i = indx -1 means temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
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

    public int removeFirst(){
        
        if(size==0){
            System.out.println("List is Empty nothing to remove");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        
        if(size==0){
            System.out.println("List is Empty nothing to remove");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int iterative_search(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;

        }
        int indx = helper(head.next, key);
        if(indx == -1){
            return -1;
        }
        return indx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public static void main(String[] args) {
        Constructing_ll list = new Constructing_ll();
        list.addFirst(1);
        list.printingLL();
        list.addFirst(2);
        list.printingLL();
        list.addLast(3);
        list.printingLL();
        list.addLast(4);
        list.printingLL();
        
        list.addMiddle(2, 21);
        list.printingLL();
        System.out.println(list.size);
        list.removeFirst();
        list.printingLL();
        System.out.println(list.size);
        list.removeLast();
        list.printingLL();
        System.out.println(list.size);
        System.out.println("Iterative Search");
        System.out.println("Found at index : "+list.iterative_search(3));
        System.out.println("Recursive Search");
        System.out.println("Found at index : "+list.recursiveSearch(3));
    }
    
}
