package com.cpe4235.selfmylost.testlogicalgorithm.main;

import java.util.Scanner;

/**
 *
 * @author RainWhileLoop
 */
public class TestSwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.print("Input your score : ");
        score = scanner.nextInt();
        String grade = gradeCalculate(score);
        System.out.println("Your Grade = " + grade);

//        for(int i = 102; i > -10; i--) {
//            System.out.println("score : " + i + "   grade " + gradeCalculate(i) + "\n");
//        }
    }
    
    private static String gradeCalculate(int score) {
        String grade;
        int num, error, a, b, c, d, f, negNum;
        
        error = score / 101 * 100;
        a = score % 101 / 80 * 4;
        b = score % 101 % 80 / 70 * 3;
        c = score % 101 % 80 % 70 / 60 * 2;
        d = score % 101 % 80 % 70 % 60 / 50 * 1;
        f = score % 101 % 80 % 70 % 60 % 50 * 0;
        negNum = (Math.abs(score) - score) * 100;
        num = error + a + b + c + d + f + negNum;

//        System.out.println(error + " " + a + " " + b + " " + c + " " + d + " " + f);
        switch (num) {
            case 4:
                grade = "A";
                break;
            case 3:
                grade = "B";
                break;
            case 2:
                grade = "C";
                break;
            case 1:
                grade = "D";
                break;
            case 0:
                grade = "F";
                break;
            default:
                grade = "Error";
        }
        return grade;
    }
}
