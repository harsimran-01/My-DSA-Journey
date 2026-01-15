
import java.util.ArrayList;

public class cycleDFS_DIR {

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

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean isVisit[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!isVisit[i]) {
                if (isCycleUtil(graph, i, isVisit, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean isVisit[], boolean stack[]) {
        isVisit[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }
            if (!isVisit[e.dest] && isCycleUtil(graph, e.dest, isVisit, stack)) {

                return true;

            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
