import java.util.*;
public class tarjansAlgo {
    static class Edge {

        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

    }

    public static void dfs(ArrayList<Edge> graph[],int curr,int par,int dt[],int low[],int time,boolean isVisit[]){

        isVisit[curr] = true;
        dt[curr] = low[curr] = ++time;
        for(int i=0;i<graph[curr].size();i++){

            Edge e = graph[curr].get(i); //src,dest
            int neigh = e.dest;
            if(neigh == par){
                continue;
            }else if(!isVisit[neigh]){
                dfs(graph, neigh, curr, dt, low, time, isVisit);
                low[curr] = Math.min(low[curr],low[neigh]);
                //bridge

                if(dt[curr] < low[neigh]){
                    System.out.print("Bridge exists : "+curr + " ---- " + neigh);
                }
            }else{
                low[curr] = Math.min(low[curr],dt[neigh]);
            }

        }
    }
    public static void tarjans_Algo(ArrayList<Edge> graph[],int V){
        boolean isVisit[] = new boolean[V];
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;

        //dfs
        for(int i=0;i<V;i++){
            if(!isVisit[i]){
                dfs(graph,i,-1,dt,low,time,isVisit);
            }
        }


    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjans_Algo(graph, V);
    }
}
