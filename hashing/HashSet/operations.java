import java.util.*;

public class operations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();


        //adding in hashset
        set.add(1);
        set.add(10);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(3);
        System.out.println(set);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();


        //adding in linkedhashset
        set1.add(1);
        set1.add(10);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(1);
        set1.add(3);

        System.out.println(set1);

        TreeSet<Integer> set2 = new TreeSet<>();
        //adding in treeset
        set2.add(1);
        set2.add(10);
        set2.add(2);
        set2.add(3);
        set2.add(5);
        set2.add(1);
        set2.add(3);

        System.out.println(set2);

        //contains
        System.out.println("5 is in Set : " + set.contains(5));
        System.out.println("15 is in Set : " + set.contains(15));

        //remove

        System.out.println("Removing 1 : "+set.remove(1));
        System.out.println(set);

        //iterations
        //using iterators

        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();

        //using for each

        for (Integer it : set){
            System.out.print(it + " ");
        }
    }
}
