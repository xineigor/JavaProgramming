package Lab_9.Demo_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();

        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }

        String author = scan.nextLine();

        String[] array = author.split(" ");
        if (array.length > 2
                || Character.isDigit(array[0].charAt(0))
                || Character.isDigit(array[1].charAt(0))) {
            throw new IllegalArgumentException("Author not valid!");
        }

        double price = Double.parseDouble(scan.nextLine());

        if (price < 1) {
            System.out.println("Price not valid!");
            //throw new IllegalArgumentException("Price not valid!");
            throw new IllegalArgumentException();
        }

        Book sampleBook = new Book(title, author, price);
        Book goldenEditionBoook = new GoldenEditionBook(title, author, price);

        System.out.println(sampleBook);
        System.out.println(goldenEditionBoook);
    }
}
