import java.util.ArrayList;
import java.util.PriorityQueue;

public class mstPRIMS {
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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));


    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v,int cost){
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }

    }
    static class Pair2 implements Comparable<Pair2>{
        int v;
        int par;
        int cost;

        public Pair2(int v,int par,int cost){
            this.v = v;
            this.par = par;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair2 p2){
            return this.cost - p2.cost;
        }

    }

    //calculate the minimum cost of mst 
    public static void prims(ArrayList<Edge> graph[]){
        boolean isVisit[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!isVisit[curr.v]){
                isVisit[curr.v] = true;
                finalCost+=curr.cost;

                //neighbours
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }

            }
        }
        System.out.println("Final cost = "+finalCost);

    }
    //returning the edges of the mst 
    public static void prims2(ArrayList<Edge> graph[]){
        boolean isVisit[] = new boolean[graph.length];
        PriorityQueue<Pair2> pq = new PriorityQueue<>();

        pq.add(new Pair2(0, -1,0));
        ArrayList<Edge> list = new ArrayList<>();

        while(!pq.isEmpty()){
            Pair2 curr = pq.remove();
            if(!isVisit[curr.v]){
                isVisit[curr.v] = true;
                if(curr.par != -1){
                    list.add(new Edge(curr.par, curr.v, curr.cost));
                }

                //neighbours
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair2(e.dest,curr.v, e.wt));
                }

            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).src + " - " + list.get(i).dest + " : " + list.get(i).wt);
        }

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        prims(graph);
        prims2(graph);
    }
}
