package Lab_1;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str_in = scan.nextLine();

        String ch1 = scan.nextLine();  //считывание значений
        String ch2 = scan.nextLine();

        int index1 = str_in.indexOf(ch1); //индекс нужных значений
        int index2 = str_in.indexOf(ch2);

        String ch1_upper_case = str_in.substring(index1, index1).toUpperCase(); //нужные значения по индексу в строку и перевод
        String ch2_upper_case = str_in.substring(index2, index2).toUpperCase();


        //StringBuffer str_in_sb = new StringBuffer(str_in);
        //str_in_sb.setCharAt(0, 'c');
        //System.out.println(strBuffer.toString());

//        StringBuffer str_buffer = new StringBuffer(str_in);  //решение через str buffer
//
//        str_buffer.delete(0,1);
//        str_buffer.delete(3,4);
//
//        String result = new String(str_buffer);

//        String result;                                          //решение через substring
//        result = str_in.substring(1, str_in.length() - 1);


        System.out.println(ch1_upper_case);
        System.out.println(ch2_upper_case);
    }
}