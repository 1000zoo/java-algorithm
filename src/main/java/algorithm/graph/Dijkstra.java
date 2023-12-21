package algorithm.graph;

import java.util.Arrays;

public class Dijkstra {

    public int[] dijkstra(int numOfEdges, int[][] edges, int start) {
        int[] shortestDistances = new int[numOfEdges];
        boolean[] added = new boolean[numOfEdges];
        int[][] graph = createGraph(edges, numOfEdges);

        Arrays.fill(shortestDistances, Integer.MAX_VALUE);
        shortestDistances[start] = 0;

        int[] parents = new int[numOfEdges];
        parents[start] = -1;

        for (int i = 1; i < numOfEdges; i++) {
            int nearestNode = -1;
            int shortestDistance = Integer.MAX_VALUE;

            for (int index = 0; index < numOfEdges; index++) {
                if (!added[index] && shortestDistances[index] < shortestDistance) {
                    nearestNode = index;
                    shortestDistance = shortestDistances[index];
                }
            }

            added[nearestNode] = true;

            for (int index = 0; index < numOfEdges; index++) {
                int edgeDistance = graph[nearestNode][index];
                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[index])) {
                    parents[index] = nearestNode;
                    shortestDistances[index] = shortestDistance + edgeDistance;
                }
            }

        }

        return shortestDistances;
    }

    private int[][] createGraph(int[][] edges, int numOfEdges) {
        int[][] graph = new int[numOfEdges][numOfEdges];

        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = edge[2];
            graph[edge[1]][edge[0]] = edge[2];
        }

        return graph;
    }
}
