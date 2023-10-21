package Lab_1;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str_in = scan.nextLine();

        StringBuffer str_buffer = new StringBuffer(str_in);

        str_buffer.delete(0,1);
        str_buffer.delete(3,4);

        String result = new String(str_buffer);


        System.out.println(result.toUpperCase());


    }
}