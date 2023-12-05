package Test;

public class Test1 {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {3, 2, 1}
        };

        for (int arr[] : matrix){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
