import java.util.LinkedList;


//time complexity = O(n)
public class iterative_search {
    public static int iterativeSearch(LinkedList<Integer> list,int key){
        for(int i=0;i<list.size();i++){
            if(list.get(i) == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int key = 3;

        System.out.println("Iterative Search");
        System.out.println(key + " is found at index : "+iterativeSearch(list, key));

    }
}
