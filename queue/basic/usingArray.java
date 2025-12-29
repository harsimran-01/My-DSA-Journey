

public class usingArray {
    static class queueArray{
        static int arr[];
        static int size;
        static int rear;

        public queueArray(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void enque(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;

        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

        
    }
    public static void main(String[] args) {
        queueArray q = new queueArray(5);
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
