package com.cpe4235.almz.testlogicalgorithm.main;

import java.util.Scanner;

/**
 *
 * @author GunDesstiiniizz
 */
public class TestString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.print("Input a text : ");
        text = scanner.next();
        int length = findLength(text);

        System.out.println("text.length = " + length);

        System.out.print("\ntext.split are : ");
        String[] textSplit = split(text);
        for (String t : textSplit) {
            System.out.print(" " + t);
        }
        System.out.println("\n\nSeparate between text and number : ");
        String[] textSeparate = separate(text);
        System.out.println("  text : " + textSeparate[0]);
        System.out.println("number : " + textSeparate[1]);

    }

    private static int findLength(String text) {
        return text.length();
    }

    private static String[] split(String text) {
        return text.split("-");
    }

    /**
     * แยกอักขระกับตัวเลขใน text เดียวกันเป็น array 2 ค่า<br/>
     * ตัวอย่าง 32December2012 ได้ผลลัพธ์คือ<br/>
     * text[0] = December<br/>
     * text[1] = 322012<br/>
     *
     * @param text
     * @return an array of text and number
     */
    private static String[] separate(String text) {
        String[] texts = {"", ""};

        String[] textTmp = text.split("\\d");
        String[] numberTmp = text.split("[a-zA-Z]");
        for (String t : textTmp) {
            texts[0] = texts[0] + t;
        }
        for (String n : numberTmp) {
            texts[1] = texts[1] + n;
        }

        return texts;
    }
}
