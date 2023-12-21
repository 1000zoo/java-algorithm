package algorithm.graph;

import util.ArrayPrinter;

class DijkstraTest {

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();

        int[][] edges =
                new int[][]{{0, 1, 1}, {1, 2, 3}, {2, 4, 2}, {1, 6, 1}, {6, 4, 1}, {1, 3, 5}, {3, 5, 3}, {2, 3, 1},
                        {4, 5, 2}};

        int[] result = dijkstra.dijkstra(7, edges, 0);

        ArrayPrinter printer = new ArrayPrinter();
        printer.print(result);

    }
}