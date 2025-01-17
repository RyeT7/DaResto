package utils;

import java.util.Random;
import java.util.Scanner;

public class Util {

    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();

    public static String nextLine() {
        return sc.nextLine();
    }

    public static int nextInt() {
        int i = sc.nextInt();
        sc.nextLine();

        return i;
    }

    public static void clearScreen(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static Character randomChar(){
        return (Character) (char) (random.nextInt(26) + 'A');
    }

    public static int getRandomInteger(int lowerBound, int upperBound){
        return random.nextInt(upperBound + 1) + lowerBound;
    }
}
