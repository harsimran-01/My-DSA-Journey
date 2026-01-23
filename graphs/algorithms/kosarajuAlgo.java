package algorithms;

import java.util.*;

public class kosarajuAlgo {

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
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));

    }

    public static void dfs(ArrayList<Edge> graph[], int src, boolean isVisit[]) {
        isVisit[src] = true;
        System.out.print(src + " ");
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!isVisit[e.dest]) {
                dfs(graph, e.dest, isVisit);
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[], int src, boolean isVisit[], Stack<Integer> s) {
        isVisit[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!isVisit[e.dest]) {
                topSort(graph, e.dest, isVisit, s);
            }
        }
        s.push(src);
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        boolean isVisit[] = new boolean[V];
        //step 1
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!isVisit[i]) {
                topSort(graph, i, isVisit, s);
            }
        }

        //step 2 transpose graph
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            isVisit[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        //step 3 stack empty
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!isVisit[curr]) {
                //printing all the strongly connected components
                System.out.print("SCC -> ");
                dfs(transpose, curr, isVisit);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);

    }
}
