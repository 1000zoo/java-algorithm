package util;

public class ArrayPrinter {

    public <T> void print(T[] arr) {
        for (T val : arr) {
            System.out.printf("%.2s,", val.toString());
        }
        System.out.println();
    }

    public void print(int[] arr) {
        for (int val : arr) {
            System.out.printf("%2d,", val);
        }
        System.out.println();
    }

    public <T> void print(T[][] grid) {
        for (T[] row : grid) {
            print(row);
        }
        System.out.println();
    }

    public void print(int[][] grid) {
        for (int[] row : grid) {
            print(row);
        }
        System.out.println();
    }
}
