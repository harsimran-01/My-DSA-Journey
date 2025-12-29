import java.util.ArrayList;

public class maximum {
    public static int max(ArrayList<Integer> list){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > largest) largest = list.get(i);
        }
        return largest;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Largest element in List = "+max(list));
        
    }
    
}
