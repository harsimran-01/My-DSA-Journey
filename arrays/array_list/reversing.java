import java.util.ArrayList;

public class reversing {
    public static void reverse(ArrayList<Integer> list){
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
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Printing list");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // System.out.println("Reversing List");
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        System.out.println("Reversing using Swapping");
        reverse(list);


        
    }
}
