import java.util.*;

public class sortStack {
    public static void insert(Stack<Integer> st,int element){
        if(st.isEmpty() || element >= st.peek()){
            st.push(element);
        }else{
            int temp = st.pop();
            insert(st, element);
            st.push(temp);
        }
    }
    public static void sortedStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        //popping all elements and perform sorting and then inserting

        int temp = st.pop();
        sortedStack(st);
        insert(st,temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(4);

        // while(!st.isEmpty()){
        //     System.out.print(st.pop() + " ");
        // }

        sortedStack(st);

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }

    }
}
