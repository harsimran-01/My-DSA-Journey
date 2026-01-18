
import java.util.*;

public class cheapestFlights {
    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Info implements Comparable<Info>{
        int v;
        int cost;
        int stops;

        public Info(int v,int cost,int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }

        public int compareTo(Info i2){
            return this.stops - i2.stops;
        }
    }

    public static void createGraph(int flights[][],ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<flights.length;i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }
    public static int cheapestFlight(int n,int flights[][],int src,int dest,int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        for(int i=0;i<dist.length;i++){
            dist[i] = Integer.MAX_VALUE;
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);
                int u  =e.src;
                int v = e.dest;
                int wt = e.wt;

                //relaxation step
                if(curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int flights[][] = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0;
        int dest = 2;
        int k = 1;

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);
        System.out.println(cheapestFlight(n, flights, src, dest, k));

    }
}
