package Lab_8.N_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AppleTree Tree = new AppleTree(scan.nextLine(), Integer.parseInt(scan.nextLine()));
        System.out.println(Tree.getInfo());
    }
}
