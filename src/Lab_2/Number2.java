package Lab_2;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fruit :");
        String Fruit = scan.nextLine();

        Fruit = Fruit.toLowerCase();  //перевод в нужный формат

        // проверка на фрукт сделать

        System.out.println("Day of the week: ");
        String day_week = scan.nextLine();

        day_week = day_week.toLowerCase();  // перевод в нужный формат

        System.out.println("Quantity kg: ");
        float kg = scan.nextFloat();

        double Price = 0;
        boolean is_weekend;

        if ((day_week.equals("saturday")) || (day_week.equals("sunday"))) {
            is_weekend = true;
        } else {
            is_weekend = false;
        }

        switch (Fruit) {
            case ("apple"):
                Price = 9.55 * 100 * kg;
                break;
            case ("plum"):
                Price = 10.98 * 100 * kg;
                break;
            case ("banana"):
                Price = 11.49 * 100 * kg;

                if (is_weekend){
                    Price = Price * 0.91;
                }

                break;
            case ("grapes"):
                Price = 15.99 * 100 * kg;

                if (!(is_weekend)){
                    Price = Price * 0.91;
                }

                break;
            case ("orange"):
                Price = 17.99 * 100 * kg;
                break;
            case ("kiwi"):
                Price = 37.99 * 100 * kg;
                break;
            case ("mango"):
                Price = 39.99 * 100 * kg;
                break;
            default:
                System.out.println("NO");
                break;

        }
        System.out.println(Price);
    }
}
