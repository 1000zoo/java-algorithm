package algorithm.graph;

import java.util.Arrays;

public class FloydWarshall {

    public int[][] floydWarshall(int n, int[][] graph) {
        int[][] dp = infiniteGrid(n);

        for (int[] edge : graph) {
            dp[edge[0]][edge[1]] = edge[2];
            dp[edge[1]][edge[0]] = edge[2];
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }
                    int sum = dp[i][k] + dp[k][j];
                    if (dp[i][k] == Integer.MAX_VALUE || dp[k][j] == Integer.MAX_VALUE) {
                        sum = Integer.MAX_VALUE;
                    }
                    dp[i][j] = Math.min(dp[i][j], sum);
                }
            }
        }

        return dp;
    }

    private int[][] infiniteGrid(int n) {
        int[][] grid = new int[n][n];
        for (int[] arr : grid) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        return grid;
    }
}
