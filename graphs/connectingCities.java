
import java.util.ArrayList;
import java.util.PriorityQueue;

public class connectingCities {
    static class Edge implements Comparable<Edge>{

        // int src;
        int dest;
        int wt;

        public Edge(int dest, int wt) {
            // this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    public static int connectingCity(int cities[][]){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean isVisit[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!isVisit[curr.dest]){
                isVisit[curr.dest] = true;
                finalCost += curr.wt;

                for(int i=0;i<cities[curr.dest].length;i++){
                    if(cities[curr.dest][i] != 0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int cities[][] = {{0,1,2,3,4},
                          {1,0,5,0,7},
                          {2,5,0,6,0},
                          {3,0,6,0,0},
                          {4,7,0,0,0}};
        ArrayList<Edge> graph[] = new ArrayList[cities.length];                  
    }
}
