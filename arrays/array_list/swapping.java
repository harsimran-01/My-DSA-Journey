import java.util.ArrayList;

public class swapping {
    public static void swap( ArrayList<Integer> list){
        int low = 0;
        int high = list.size()-1;
        while(low<=high){
            int temp = list.get(low);
            list.set(low, list.get(high));
            list.set(high, temp);
            low++;
            high--;
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("Swapping");
        swap(list);
    }
}
