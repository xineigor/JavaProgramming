package Lab_6;

import java.util.Scanner;

public class NumberOneNoArrayList {
    public static void main(String[] args) {
        //String nothingLine = "";
        Scanner scan = new Scanner(System.in);
        String noFormatArray = scan.nextLine();
        String endCh = String.valueOf(noFormatArray.charAt(noFormatArray.length() - 1));
        int sizeArray = 0;

        if (!(endCh.equals(" "))) {
            noFormatArray = noFormatArray + " ";
        }


        String[] words = noFormatArray.split(" ");

        for (String lt : words) {
            int i = 0;
            words[i]= String.valueOf(Integer.parseInt(words[i]));
            i++;
            if (i > words.length){
                break;
            }
        }
    }
}
