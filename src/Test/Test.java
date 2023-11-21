package Test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        word = word.replaceAll("\s+", "");

        //Pattern patt = Pattern.compile("/S");
        //String s = patt.matcher(word).replaceAll(patt);


        System.out.println(word);
    }
}
