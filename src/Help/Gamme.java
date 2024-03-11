package Help;
import java.util.Scanner;

public class Gamme {
    public static final char P = 'P';
    public static final char L = 'L';
    public static final char O = 'O';
    public static final char F = 'F';
    public static final char B = 'B';
    public static boolean finish = false;
    public static char[][][] flat = {
            {
                    {P, O, O, O, O, O},
                    {O, B, O, O, O, O},
                    {O, O, O, O, O, O},
                    {O, O, B, O, O, O},
                    {O, O, L, O, O, O}
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
            }
    };
    public static final char W = 'w';
    public static final char S = 's';
    public static final char A = 'a';
    public static final char D = 'd';
    public static final int FLOORS = flat.length;
    public static final int ROWS = flat[0].length;
    public static final int COLS = flat[0][0].length;
    public static int floor = 0;
    public static int row = 0;
    public static int col = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!finish) {
            printCurrentArray();
            System.out.println("Пожалуйста, напишите ход: ");
            String move = scanner.nextLine();
            if (move.length() == 1) {
                switch (move.charAt(0)) {
                    case W:
                        goForward();
                        break;
                    case S:
                        goBack();
                        break;
                    case A:
                        goLeft();
                        break;
                    case D:
                        goRight();
                        break;
                    default:
                        System.out.println("Please, try again");
                }
            }
        }
    }

    public static void printCurrentArray() {
        System.out.println("Этаж " + (floor + 1) + ":");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(flat[floor][i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void goForward() {
        if ((row - 1 < 5 && row - 1 > -1) && (col < 6 && col > -1)) {
            if (row > 0 && flat[floor][row - 1][col] != B) {
                if (flat[floor][row - 1][col] == F) {
                    System.out.println("Финиш!");
                    finish = true;
                    return;
                }
                if (flat[floor][row - 1][col] == L) {
                    if (floor < FLOORS - 1) {
                        int prevRow = row;
                        int prevCol = col;
                        floor++;
                        row = prevRow;
                        col = prevCol;
                    } else {
                        System.out.println("Вы достигли последнего этажа.");
                    }
                } else {
                    flat[floor][row][col] = O;
                    row--;
                    flat[floor][row][col] = P;
                }
            }
        } else {
            System.out.println("Going beyond boundaries...");
        }
    }

    public static void goBack() {
        if ((row + 1 < 5 && row + 1 > -1) && (col < 6 && col > -1)) {
            if (flat[floor][row + 1][col] != B) {
                if (flat[floor][row + 1][col] == F) {
                    System.out.println("Финиш!");
                    finish = true;
                    return;
                }
                if (flat[floor][row + 1][col] == L) {
                    if (floor > 0) {
                        int prevRow = row;
                        int prevCol = col;
                        floor++;
                        row = prevRow;
                        col = prevCol;
                    } else {
                        System.out.println("Вы достигли первого этажа.");
                    }
                } else {
                    flat[floor][row][col] = O;
                    row++;
                    flat[floor][row][col] = P;
                }
            }
        } else {
            System.out.println("Going beyond boundaries...");
        }
    }

    public static void goLeft() {
        if ((row < 5 && row > -1) && (col - 1 < 6 && col - 1 > -1)) {
            if (flat[floor][row][col - 1] != B) {
                if (flat[floor][row][col - 1] == F) {
                    System.out.println("Финиш!");
                    finish = true;
                    return;
                }
                if (flat[floor][row][col - 1] == L) {
                    if (col < COLS - 1) {
                        int prevRow = row;
                        int prevCol = col;
                        floor++;
                        row = prevRow;
                        col = prevCol;
                    } else {
                        System.out.println("Вы достигли последнего этажа.");
                    }
                } else {
                    flat[floor][row][col] = O;
                    col--;
                    flat[floor][row][col] = P;
                }
            }
        }
    }

    public static void goRight() {
        if ((row < 5 && row > -1) && (col + 1 < 6 && col + 1 > -1)) {
            if (flat[floor][row][col + 1] != B) {
                if (flat[floor][row][col + 1] == F) {
                    System.out.println("Финиш!");
                    finish = true;
                    return;
                }
                if (flat[floor][row][col + 1] == L) {
                    if (floor < FLOORS - 1) {
                        int prevRow = row;
                        int prevCol = col;
                        floor++;
                        row = prevRow;
                        col = prevCol;
                    } else {
                        System.out.println("Вы достигли последнего этажа.");
                    }
                } else {
                    flat[floor][row][col] = O;
                    col++;
                    flat[floor][row][col] = P;
                }
            }
        }
    }
}