// package hashing.HashMap;

import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        int ans = arr.length / 3;
        Set<Integer> key = map.keySet();
        for (Integer i : key) {
            if(map.get(i) > ans){
                System.out.print(i + " ");
            }
        }
    }
}
