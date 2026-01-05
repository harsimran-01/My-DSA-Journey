
import java.util.PriorityQueue;

// package Heap.medium;
public class weakestSoldier {

    static class Row implements Comparable<Row> {

        int sold;
        int indx;

        Row(int sold, int indx) {
            this.indx = indx;
            this.sold = sold;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.sold == r2.sold) {
                return this.indx - r2.indx;
            } else {
                return this.sold - r2.sold;
            }
        }
    }

    public static void main(String[] args) {
        int weaker[][] = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < weaker.length; i++) {
            int count = 0;
            for (int j = 0; j < weaker[0].length; j++) {
                count += weaker[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        int k = 2;
        for (int i = 0; i < k; i++) {

            System.out.print("Weaker soldiers : "+pq.remove().indx);
            System.out.println();
        }
    }

}
