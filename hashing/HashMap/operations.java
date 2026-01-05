
import java.util.*;

// package hashing.HashMap;

public class operations {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println("HashMap Operations");
        //Restaurant menu
        //insert
        map.put("Burger", 10);
        map.put("Pizza", 20);
        map.put("Fries", 5);
        map.put("Noodles", 15);
        map.put("Pasta", 10);

        System.out.println("Details are : " + map);

        //get

        System.out.println("Value of Burger is  : "+map.get("Burger"));
        System.out.println("Value of Coke is  : "+map.get("Coke"));

        //containsKey

        System.out.println("Burger is Available : "+map.containsKey("Burger"));
        System.out.println("burger is Available : "+map.containsKey("burger"));
        System.out.println("Coke is Available : "+map.containsKey("Coke"));

        //remove

        // System.out.println(map.remove("pasta"));
        // System.out.println(map.remove("Pasta"));
        // System.out.println(map);

        //clear

        // map.clear();
        System.out.println(map);

        //isEmpty

        System.out.println(map.isEmpty());

        //iterate
        System.out.println("Keys are : ");
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println("(" + key + " , " + map.get(key) + ") ");
        }



    }
}
