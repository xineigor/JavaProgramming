package Service;

public class Service {
    public static void printMatrix(int[][] matrix) {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.print("\b");
            System.out.println();
        }
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] x : matrix) {
            for (String y : x) {
                System.out.print(y + "\t");
            }
            System.out.print("\b");
            System.out.println();
        }
    }
}
