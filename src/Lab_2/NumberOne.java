package Lab_2;

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
        String way1 = scan.nextLine();

        if (way1.matches("[a-zA-Z]+")) {  //проверка данных
            System.out.println("FORMAT ERROR");
        } else {

        int way = Integer.parseInt(way1);
        String[] times = arrival.split(":"); //формат вводных данных
        String time1 = times[0];
        String time2 = times[1];
        int time1_int = Integer.parseInt(time1);
        int time2_int = Integer.parseInt(time2);

        //операции с данными
        int time1_int_minuet = time1_int * 60; //перевод в минуты
        int sum_time = time1_int_minuet + time2_int; // время прибытия в минутах
        int time_way = sum_time - way; // время пути в минутах
        int format1_time = time_way / 60;
        int format2_time = time_way % 60;

        String format11_time = String.valueOf(format1_time); // перевод в нужный формат
        if (format11_time.length() == 1) {
            format11_time = "0" + format11_time;
        }

        String format22_time = String.valueOf(format2_time); // перевод в нужный формат
        if (format22_time.length() == 1) {
            format22_time = "0" + format22_time;
        }

        boolean minus_check_1 = format11_time.contains("-"); //проверка выхождения за 00:00
        boolean minus_check_2 = format22_time.contains("-");

        int format11_time_int = Integer.parseInt(format11_time);
        int format22_time_int = Integer.parseInt(format22_time);

        if (!((minus_check_2) || (minus_check_1))) {
            System.out.println(format11_time + ':' + format22_time); //вывод обычный без выхода за 00:00
        }

        if ((minus_check_2) || (minus_check_1)) { //перевод в минуты чтобы высчитать выход за 00:00

            int result_format = 1440 + format22_time_int;
            int format11_time_int_min = format11_time_int * 60;
            result_format = result_format + format11_time_int_min;
            int result_format1 = result_format / 60;
            int result_format2 = result_format % 60;

            System.out.println(result_format1 + ":" + result_format2); //вывод с выходом за 00:00
        }}


    }
}