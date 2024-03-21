package Lab_9.Demo_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());

        Book sampleBook = new Book(title, author, price);
        Book goldenEditionBoook = new GoldenEditionBook(title, author, price);

        System.out.println(sampleBook);
        System.out.println(goldenEditionBoook);
    }
}
