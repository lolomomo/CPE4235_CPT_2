package com.cpe4235.almz.testlogicalgorithm.main;

import java.util.Scanner;

/**
 *
 * @author GunDesstiiniizz
 */
public class TestIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("No.1 input : ");
        num1 = scanner.nextInt();
        System.out.println("No.2 input : ");
        num2 = scanner.nextInt();
        System.out.println("No.3 input : ");
        num3 = scanner.nextInt();

        int max = findMax(num1, num2, num3);

        System.out.println("max = " + max);
    }

    private static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
    }
}
