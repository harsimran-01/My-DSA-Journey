// package queue.basic;

public class circularQueue {
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public queue(int n) {
            arr = new int[n]; 
            rear = -1;
            front = -1;
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void enque(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front =  -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            
            return arr[front];
        }

        
    }
    public static void main(String[] args) {
        queue q = new queue(5);
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
