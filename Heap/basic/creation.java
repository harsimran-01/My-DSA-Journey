// package Heap.basic;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class creation {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data); //adding -> O(1)

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){ // min heap prop -> O(log n)
                //swapping

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }

        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2 * i +1;
            int right = 2 * i +2;
            int min = i;

            if(left < arr.size() && arr.get(min) > arr.get(left)){
                min = left;
            }
            if(right < arr.size() && arr.get(min) > arr.get(right)){
                min = right;
            }

            if(min != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //swap first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete the last element

            arr.remove(arr.size()-1);

            //heapify

            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Heap implementation");
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);

        while(!h.isEmpty()){
            System.out.print(h.peek() + " ");
            h.remove();
        }
        System.out.println();
        // System.out.println("Top element in heap : "+h.peek());

        // h.remove();
        // h.printHeap();
        System.out.println("Priority Queue");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(10);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }

    }
}
