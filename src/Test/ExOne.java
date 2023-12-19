package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExOne {
    public static void main(String[] args) {
        // IP адрес
        String regexp = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
// для сравнения работы find() и matches()
        String goodIp = "192.168.0.3";
        String badIp = "192.168.0.3g";

        Pattern pattern = Pattern.compile(regexp);

        Matcher matcher = pattern.matcher(goodIp);
// matches() - true, find() - true
        matcher = pattern.matcher(badIp);
// matches() - false, find() - true

// а теперь получим дополнительную информацию
        System.out.println(matcher.find() ?
                "I found '" + matcher.group() + "' starting at index " + matcher.start() + " and ending at index " + matcher.end() + "." :
                "I found nothing!");
// I found the text '192.168.0.3' starting at index 0 and ending at index 11.
    }
}
