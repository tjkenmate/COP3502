//package study.thorjohansson.module2;

import java.util.Scanner;

/**
 * Created by Thor Johansson on 5/8/2017.
 * Last edited on 5/8/2017 12:54 PM
 */
public class TwoPointsDistance {
    public static void main (String[] args){
        //Declare variables
        double x1, x2, y1, y2, result;

        //Set up scanner
        Scanner in = new Scanner(System.in);

        //Input x1 y1
        System.out.print("Enter x1 and y1: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();

        //New line for aesthetics
        System.out.println();

        //Input x2 y2
        System.out.print("Enter x2 and y2: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        //New line for aesthetics
        System.out.println();

        //Calc result
        result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        //Print Result
        System.out.println("The distance between the two points is: "+ result);
    }
}
