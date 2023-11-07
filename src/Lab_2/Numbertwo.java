package Lab_2;

import java.util.Scanner;

public class Numbertwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fruit :");
        String Fruit = scan.nextLine();

        Fruit = Fruit.toLowerCase();  //перевод в нужный формат

        if ((!(Fruit.equals("apple"))) && (!(Fruit.equals("plum"))) && (!(Fruit.equals("banana"))) && (!(Fruit.equals("grapes"))) && (!(Fruit.equals("orange"))) && (!(Fruit.equals("kiwi"))) && (!(Fruit.equals("mango")))) {
            System.out.println("FRUIT INVALID");
            System.exit(0);      //проверки на правильность введения
        }

        System.out.println("Day of the week: ");
        String day_week = scan.nextLine();

        day_week = day_week.toLowerCase();  // перевод в нужный формат

        if ((!(day_week.equals("monday"))) && (!(day_week.equals("tuesday"))) && (!(day_week.equals("wednesday"))) && (!(day_week.equals("thursday"))) && (!(day_week.equals("friday"))) && (!(day_week.equals("saturday"))) && (!(day_week.equals("sunday")))) {
            System.out.println("DAY INVALID");
            System.exit(0);      //проверки на правильность введения
        }

        System.out.println("Quantity kg float: ");
        String kg_str = scan.nextLine();

        if ((kg_str.matches("[a-zA-Z]+")) || (!(kg_str.contains(",")) && !(kg_str.contains(".")))) {  // проверка на тип в кг
            System.out.println("INVALID");
            System.exit(0);
        }

        if (kg_str.contains(",")) {    // формат точки и запятой
            kg_str = kg_str.replace(",", ".");
        }

        double kg = Double.parseDouble(kg_str);
        double Price = 0;
        boolean is_weekend;

        is_weekend = (day_week.equals("saturday")) || (day_week.equals("sunday")); //проверка на день недели

        switch (Fruit) {                                    //логика
            case ("apple") -> Price = 9.55 * 100 * kg;
            case ("plum") -> Price = 10.98 * 100 * kg;
            case ("banana") -> {
                Price = 11.49 * 100 * kg;
                if (is_weekend) {
                    Price = Price * 0.91;
                }
            }
            case ("grapes") -> {
                Price = 15.99 * 100 * kg;
                if (!(is_weekend)) {
                    Price = Price * 0.91;
                }
            }
            case ("orange") -> Price = 17.99 * 100 * kg;
            case ("kiwi") -> Price = 37.99 * 100 * kg;
            case ("mango") -> Price = 39.99 * 100 * kg;
            default -> System.out.println("NO");
        }

        System.out.printf("%.2f", Price);   // округление в большую сторону
    }
}
