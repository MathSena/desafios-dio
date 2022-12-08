package Tonnie;

import java.util.Scanner;

public class ThreePower {
    public static boolean isPowerOfThree3(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;

    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int n = inputReader.nextInt();
        System.out.println(isPowerOfThree3(n));

    }


}
