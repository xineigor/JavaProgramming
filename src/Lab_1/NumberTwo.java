package Lab_1;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String strIn = scan.nextLine();

        String chOne = scan.nextLine();  //считывание значений // todo char дложен +
        String chTwo = scan.nextLine();

        int indexOne = strIn.indexOf(chOne); //индекс нужных значений
        int indexTwo = strIn.indexOf(chTwo);

        int tmp;

        if (indexOne > indexTwo) {   //проверка на правильный порядок индексов
            tmp = indexOne;
            indexOne = indexTwo;
            indexTwo = tmp;
        }

        String chOneUpperCase = strIn.substring(indexOne, indexOne + 1).toUpperCase(); //нужные значения по индексу в строку и перевод
        String chTwoUpperCase = strIn.substring(indexTwo, indexTwo + 1).toUpperCase();

        String line = strIn.substring(indexOne + 1, indexTwo);  //обрезка строки по конечным буквам
        String lineEnd = chOneUpperCase + line + chTwoUpperCase;

        System.out.println(lineEnd);
    }
}