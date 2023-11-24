package Test;

import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String temp = "";

        String elements  = "Самосвальный Самарский Нормальный";

        for (int i = 0; i < elements.length(); i++){
            temp = temp + elements.charAt(i);

            if (elements.charAt(i) == ' ') {
                list.add(temp);
                temp = "";
            }
        }

        for (String ln : list) {
            System.out.print(ln);
        }
    }
}
