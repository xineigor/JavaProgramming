package Prac;

import java.util.Random;

public class RandomR {
    public static void main(String[] args) {
        Random randomRez = new Random();
        int var = randomRez.nextInt(1,7);
        System.out.println(var);

    }
}
