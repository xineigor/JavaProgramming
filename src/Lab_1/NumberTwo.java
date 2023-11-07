package Lab_1;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str_in = scan.nextLine();

        String ch1 = scan.nextLine();  //считывание значений // todo char дложен
        String ch2 = scan.nextLine();

        int index1 = str_in.indexOf(ch1); //индекс нужных значений
        int index2 = str_in.indexOf(ch2);

        int tmp;

        if (index1 > index2) {   //проверка на правильный порядок индексов
            tmp = index1;
            index1 = index2;
            index2 = tmp;
        }

        String ch1_upper_case = str_in.substring(index1, index1 + 1).toUpperCase(); //нужные значения по индексу в строку и перевод
        String ch2_upper_case = str_in.substring(index2, index2 + 1).toUpperCase();

        String stroka = str_in.substring(index1 + 1, index2);  //обрезка строки по конечным буквам
        String stroka_end = ch1_upper_case + stroka + ch2_upper_case;

        System.out.println(stroka_end);
    }
}