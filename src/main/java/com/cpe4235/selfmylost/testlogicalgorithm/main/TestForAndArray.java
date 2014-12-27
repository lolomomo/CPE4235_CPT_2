package com.cpe4235.selfmylost.testlogicalgorithm.main;

import java.util.Scanner;

/**
 *
 * @author RainWhileLoop
 */
public class TestForAndArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numbers[] = new Integer[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Input number : ");
            numbers[i] = scanner.nextInt();
        }

        int max = findMaximum(numbers);

        System.out.println("maximum number is : " + max);

        System.out.println("Before sorting");
        showArray(numbers);
        System.out.println("\n\nAfter sorting with bubblesort");
        bubbleSort(numbers);
        showArray(numbers);

    }

    private static int findMaximum(Integer[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static Integer[] bubbleSort(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }

    private static void showArray(Integer[] numbers) {
        System.out.print("index -> ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nvalue -> ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }

    private Integer[] randomNumber() {
        Integer numbers[] = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 10) + 1;
        }
        return numbers;
    }
}
