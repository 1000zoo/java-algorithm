package algorithm.graph;

import util.ArrayPrinter;

class FloydWarshallTest {

    public static void main(String[] args) {
        ArrayPrinter printer = new ArrayPrinter();
        FloydWarshall floydWarshall = new FloydWarshall();

        int[][] originMatrix =
                new int[][]{{0, 1, 1}, {1, 2, 2}, {0, 2, 3}, {2, 3, 1}, {2, 4, 1}};

        int[][] result = floydWarshall.floydWarshall(5, originMatrix);

        printer.print(toGraph(5, originMatrix));
        System.out.println("=============");
        printer.print(result);
    }

    private static int[][] toGraph(int n, int[][] edges) {
        int[][] dp = new int[n][n];
        for (int[] edge : edges) {
            dp[edge[0]][edge[1]] = edge[2];
            dp[edge[1]][edge[0]] = edge[2];
        }
        return dp;
    }

}