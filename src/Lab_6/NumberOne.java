package Lab_6;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String nothingLine = "";
        Scanner scan = new Scanner(System.in);
        String noFormatArray = scan.nextLine();

        for (int i = 0; i < noFormatArray.length(); i++){
            nothingLine = nothingLine + noFormatArray.charAt(i);

            if (noFormatArray.charAt(i) == ' ') {
                list.add(nothingLine);
                nothingLine = "";
            }
        }

        int amount = list.size();
        int sum = 0;

        for (String ln : list) {
            sum += Integer.parseInt(ln);
        }

        ArrayList<String> listShifted = list;

        while (sum > 0) {
            listShifted.add(list.get(0));
            listShifted.remove(0);
            sum--;
        }

        for (String ln : list) {
            System.out.print(ln + " ");
        }
    }
}
