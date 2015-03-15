package com.cpe4235.almz.testlogicalgorithm.main;

import java.util.Scanner;

/**
 *
 * @author GunDesstiiniizz
 */
public class TestForAndOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Input number : ");
        number = scanner.nextInt();
        
        System.out.println("Even number");
        showEvenNumber(number);
        System.out.println("\nNumber % 3 == 0");
        findNumber(number);
    }

    /**
     * This method find only even number
     *
     *
     * @param n - the max integer number which finding from 1-to-n
     * @return an even number
     */
    private static void showEvenNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    /**
     * This method find only number which divisible with 3
     *
     *
     * @param n - the max integer number which finding from 1-to-n
     * @return a integer number which divisible with 3
     */
    private static void findNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
