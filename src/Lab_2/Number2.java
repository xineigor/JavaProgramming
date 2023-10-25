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

        //if ((!(Fruit == "apple")) && (!(Fruit == "plum")) && (!(Fruit == "banana")) && (!(Fruit == "grapes")) && (!(Fruit == "orange")) && (!(Fruit == "kiwi")) && (!(Fruit == "mango"))){
        if ((!(Fruit.equals("apple"))) && (!(Fruit.equals("plum"))) && (!(Fruit.equals("banana"))) && (!(Fruit.equals("grapes"))) && (!(Fruit.equals("orange"))) && (!(Fruit.equals("kiwi"))) && (!(Fruit.equals("mango")))){
            System.out.println("FRUIT INVALID");
            System.exit(0);
        }

        System.out.println("Day of the week: ");
        String day_week = scan.nextLine();

        day_week = day_week.toLowerCase();  // перевод в нужный формат

        if ((!(day_week.equals("monday"))) && (!(day_week.equals("tuesday"))) && (!(day_week.equals("wednesday"))) && (!(day_week.equals("thursday"))) && (!(day_week.equals("friday"))) && (!(day_week.equals("saturday"))) && (!(day_week.equals("sunday")))){
            System.out.println("DAy INVALID");
            System.exit(0);
        }

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
