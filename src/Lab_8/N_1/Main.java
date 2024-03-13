package Lab_8.N_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Triangle Triangle = new Triangle(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));
        System.out.println("Area = " + Triangle.getArea());
        System.out.println("Perimeter = " + Triangle.getPerimetr());
        System.out.println(Triangle.getType());
    }
}
