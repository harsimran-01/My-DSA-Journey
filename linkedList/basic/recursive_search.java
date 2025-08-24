import java.util.LinkedList;

//time complexity = O(n) and space complexity = O(n)
public class recursive_search {
    public static int recursive_search(LinkedList<Integer> list,int key,int index){
        if(list.size()==index){
            return -1;
        }
        if(list.get(index) == key){
            return index;
        }
        return recursive_search(list, key, index+1);

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

        System.out.println("Recursive Search");
        System.out.println(key + " is found at index : "+recursive_search(list, key,0));
    }
}
