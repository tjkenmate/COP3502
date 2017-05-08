package study.thorjohansson.module2;

import java.util.Scanner;

/**
 * Created by Thor Johansson on 5/8/2017.
 * Last edited on 5/8/2017 12:42 PM
 */
public class Digits {
    public static void main(String[] args) {
        //Declare variables
        int input, result;

        //Set up scanner
        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("Enter a number between 0 - 1000: ");
        input = in.nextInt();

        //New line for aesthetics
        System.out.println();

        //calculate result
        result = input % 10 + input / 10 % 10 + input / 100 % 10;

        //Print Result
        System.out.println("The sum of the digits is: " + result);
    }
}
