package Test;

public class RgOne {
    public static void main(String[] args) {
        String text = "Heuula jellp sik";

        String textOne = text.replaceAll("H.*a", "");

        textOne = textOne.replaceAll("\\s", "");

        System.out.println(textOne);
    }
}
