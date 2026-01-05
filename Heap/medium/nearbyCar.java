
import java.util.PriorityQueue;

// package Heap.medium;

public class nearbyCar {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        int i;

        public Point(int x,int y,int dist,int i){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.i = i;
        }

        @Override
        public int compareTo(Point p2){
            return this.dist - p2.dist;
        }
    }
    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2; 

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int dist = (points[i][0] * points[i][0] ) + (points[i][1] * points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], dist,i));
        }

        for(int i=0;i<k;i++){
            System.out.print("Values are C" + pq.remove().i);
            System.out.println();
        }
    }
}
