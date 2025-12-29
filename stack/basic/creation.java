import java.util.ArrayList;
//using ARRAYLIST

public class creation {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        } 

        public static int pop(){
            if(isEmpty() == true){
                return -1;
            }
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        public static int peek(){
            if(isEmpty() == true){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
}
