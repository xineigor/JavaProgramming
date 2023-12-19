package Exam;

import java.util.Scanner;

public class Exa {
    public static final char P = 'P'; // Точка, где находится пользователь
    public static final char L = 'L'; // Точка перехода на следующий этаж
    public static final char O = 'O'; // Точка, в которую можно сделать шаг
    public static final char F = 'F'; // Конечная точка движения
    public static final char B = 'B'; // Точка, представляющая препятствие

    public static void main(String[] args) {


        char[][][] flat = {
                {
                        {O, O, O, O, O, P},
                        {O, B, O, B, B, B},
                        {O, O, O, O, O, B},
                        {O, B, O, O, O, B},
                        {O, B, O, B, O, L}
                },
                {
                        {L, O, O, O, O, O},
                        {O, O, B, O, O, O},
                        {O, O, B, O, O, O},
                        {B, O, B, O, O, O},
                        {O, O, O, O, O, O}
                },
                {
                        {O, O, O, O, O, O},
                        {O, O, O, B, O, O},
                        {O, O, O, O, O, O},
                        {O, O, O, O, B, O},
                        {O, B, O, F, O, O}
                },
        };

        Scanner scan = new Scanner(System.in);

        char currentPosition = 'P';
        int currentPositionIndexX = 0; //матрица
        int currentPositionIndexY = 0; //cтрока
        int currentPositionIndexZ = 5; //столбец

        while (currentPosition != 'F') {
            String moving = scan.nextLine();

            switch (moving) {
                case ("w") -> currentPositionIndexY -= 1;
                case ("s") -> currentPositionIndexY += 1;
                case ("a") -> currentPositionIndexZ -= 1;
                case ("d") -> currentPositionIndexZ += 1;
            }

            currentPosition = flat[currentPositionIndexX][currentPositionIndexY][currentPositionIndexZ];

            switch (currentPosition) {
                case ('L') -> currentPositionIndexX += 1;
                case ('B') -> System.out.println("Error");
                case ('F') -> System.out.println("Finish");
            }

            switch (currentPositionIndexX) {
                case (0) -> System.out.println("Этаж 1");
                case (1) -> System.out.println("Этаж 2");
                case (2) -> System.out.println("Этаж 3");
            }


        }

//        System.out.println(flat[0][0][5]);

    }
}
