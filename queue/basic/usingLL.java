// package queue.basic;

public class usingLL {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queueLL{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void enque(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = head.data;
            if(head == tail){
                tail = head = null;
            }else{
                head = head.next;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }

    }

        public static void main(String[] args) {
        
            queueLL q = new queueLL();
            q.enque(1);
            q.enque(2);
            q.enque(3);
            q.enque(4);
            q.enque(5);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.dequeue();
            }
    }
}
