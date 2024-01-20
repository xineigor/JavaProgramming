package Test;

public class TestA {
    public static void main(String[] args) {
        String input = "This is a test string";
        String regex = "\\s\\W";
        String replaced = input.replaceAll(regex, input);
    }
}
