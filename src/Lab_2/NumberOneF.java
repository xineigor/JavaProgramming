package Lab_2; // Вариант 3

import java.util.Scanner;

public class NumberOneF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получить время прибытия
        System.out.println("Enter arrival time in format HH:MM: ");
        String arrival = scanner.nextLine();

        // Валидация формат времени прибытия
        if (!arrival.contains(":")) {
            System.out.println("FORMAT ERROR: Arrival time must be in HH:MM format.");
            return;
        }

        System.out.println("Enter travel time in minutes: ");
        String wayOne = scanner.nextLine();

        // Валидация формат времени в пути
        if (!wayOne.matches("\\d+")) { // только цифры
            System.out.println("FORMAT ERROR: Travel time must be a number.");
            return;
        }

        int travelTime = Integer.parseInt(wayOne);

        // Извлекаем часы и минуты из времени прибытия
        String[] times = arrival.split(":");
        int arrivalHour = Integer.parseInt(times[0]);
        int arrivalMinute = Integer.parseInt(times[1]);

        // Время прибытия в минутах
        int arrivalInMinutes = arrivalHour * 60 + arrivalMinute;

        // Время отправления в минутах
        int departureInMinutes = arrivalInMinutes - travelTime;

        // Когда время отправления до полуночи
        if (departureInMinutes >= 0) {
            int departureHour = departureInMinutes / 60;
            int departureMinute = departureInMinutes % 60;

            // Формат вывода
            String formattedDeparture = String.format("%02d:%02d", departureHour, departureMinute);
            System.out.println(formattedDeparture);
        } else {
            // После полуночи
            departureInMinutes += 24 * 60; // + 24 часа
            int departureHour = departureInMinutes / 60;
            int departureMinute = departureInMinutes % 60;

            // Формат вывода
            String formattedDeparture = String.format("%02d:%02d", departureHour, departureMinute);
            System.out.println(formattedDeparture);
        }
    }
}