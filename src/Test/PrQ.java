package Test;

public class PrQ {
    public static void main(String[] args) {
        int num = 34456;

        String numStr = String.valueOf(num);
        int sum = Integer.parseInt(numStr.substring(0, 1)) + Integer.parseInt(numStr.substring(numStr.length() - 1));

        System.out.println(sum);
    }
}
