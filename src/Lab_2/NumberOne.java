package Lab_2; //Вариант 3

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter arrival in format ##:## : "); //ввод данных
        String arrival = scan.nextLine();

        if (!(arrival.contains(":"))) {  //проверка данных
            System.out.println("FORMAT ERROR");
            System.exit(0);
        }

        System.out.println("Enter way in min: ");
        String wayOne = scan.nextLine();

        if (wayOne.matches("[a-zA-Z]+")) {  //проверка данных
            System.out.println("FORMAT ERROR");
        } else {

            int way = Integer.parseInt(wayOne);
            String[] times = arrival.split(":"); //формат вводных данных  //возврат массива сплитом
            String timeOne = times[0];
            String timeTwo = times[1];
            int timeOneInt = Integer.parseInt(timeOne);
            int timeTwoInt = Integer.parseInt(timeTwo);

            //операции с данными
            int time1_int_minuet = timeOneInt * 60; //перевод в минуты
            int sumTime = time1_int_minuet + timeTwoInt; // время прибытия в минутах
            int timeWay = sumTime - way; // время пути в минутах
            int formatOneTime = timeWay / 60;
            int formatTwoTime = timeWay % 60;

            String formatOneOneTime = String.valueOf(formatOneTime); // перевод в нужный формат
            if (formatOneOneTime.length() == 1) {
                formatOneOneTime = "0" + formatOneOneTime;
            }

            String formatTwoTwoTime = String.valueOf(formatTwoTime); // перевод в нужный формат
            if (formatTwoTwoTime.length() == 1) {
                formatTwoTwoTime = "0" + formatTwoTwoTime;
            }

            boolean minus_check_1 = formatOneOneTime.contains("-"); //проверка выхождения за 00:00
            boolean minusCheckTwo = formatTwoTwoTime.contains("-");

            int formatOneOneTimeInt = Integer.parseInt(formatOneOneTime);
            int format22_time_int = Integer.parseInt(formatTwoTwoTime);

            if (!((minusCheckTwo) || (minus_check_1))) {
                System.out.println(formatOneOneTime + ':' + formatTwoTwoTime); //вывод обычный без выхода за 00:00
            }

            if ((minusCheckTwo) || (minus_check_1)) { //перевод в минуты чтобы высчитать выход за 00:00

                int resultFormat = 1440 + format22_time_int;
                int formatOneOneTimeIntMin = formatOneOneTimeInt * 60;
                resultFormat = resultFormat + formatOneOneTimeIntMin;
                int resultFormatOne = resultFormat / 60;
                int resultFormatTwo = resultFormat % 60;

                System.out.println(resultFormatOne + ":" + resultFormatTwo); //вывод с выходом за 00:00
            }
        }


    }
}