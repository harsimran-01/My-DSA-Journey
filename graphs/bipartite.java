import java.util.*;

public class bipartite {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        // graph[3].add(new Edge(3, 4));

        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
    }
    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int colr[] = new int[graph.length];
        for(int i=0;i<colr.length;i++){
            colr[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(colr[i] == -1){
                q.add(i);
                colr[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(colr[e.dest] == -1){
                            int nextCol = colr[curr] == 0?1:0;
                            colr[e.dest] = nextCol;
                            q.add(e.dest);
                        }else if(colr[e.dest] == colr[curr]){
                            return false;
                        }

                    }
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
