package Test;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ExTwo {
    Pattern pattern = Pattern.compile(":|;");
    String[] animals = pattern.split("cat:dog;bird:cow");

}
