package Lab_2;

import java.util.Scanner;

public class NumberTwo {
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
        String dayWeek = scan.nextLine();

        dayWeek = dayWeek.toLowerCase();  // перевод в нужный формат

        if ((!(dayWeek.equals("monday"))) && (!(dayWeek.equals("tuesday"))) && (!(dayWeek.equals("wednesday"))) && (!(dayWeek.equals("thursday"))) && (!(dayWeek.equals("friday"))) && (!(dayWeek.equals("saturday"))) && (!(dayWeek.equals("sunday")))) {
            System.out.println("DAY INVALID");
            System.exit(0);      //проверки на правильность введения
        }

        System.out.println("Quantity kg float: ");
        String kgStr = scan.nextLine();

        if ((kgStr.matches("[a-zA-Z]+")) || (!(kgStr.contains(",")) && !(kgStr.contains(".")))) {  // проверка на тип в кг
            System.out.println("INVALID");
            System.exit(0);
        }

        if (kgStr.contains(",")) {    // формат точки и запятой
            kgStr = kgStr.replace(",", ".");
        }

        double kg = Double.parseDouble(kgStr);
        double Price = 0;
        boolean isWeekend;

        isWeekend = (dayWeek.equals("saturday")) || (dayWeek.equals("sunday")); //проверка на день недели

        switch (Fruit) {                                    //логика
            case ("apple") -> Price = 9.55 * 100 * kg;
            case ("plum") -> Price = 10.98 * 100 * kg;
            case ("banana") -> {
                Price = 11.49 * 100 * kg;
                if (isWeekend) {
                    Price = Price * 0.91;
                }
            }
            case ("grapes") -> {
                Price = 15.99 * 100 * kg;
                if (!(isWeekend)) {
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
