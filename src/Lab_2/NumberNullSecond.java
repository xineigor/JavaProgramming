package Lab_2;

import java.util.Scanner;

public class NumberNullSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();

        String information = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "workday";
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница" -> "Рабочий день";
            case "Saturday", "Sunday" -> "holiday";
            case "Суббота", "Воскресенье" -> "Выходной";
            default -> "invalid weekday";
        };

        System.out.println(information);
    }
}
