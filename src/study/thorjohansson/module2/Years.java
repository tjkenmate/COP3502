//package study.thorjohansson.module2;

import java.util.Scanner;

/**
 * Created by Thor Johansson on 5/8/2017.
 * Last edited on 5/8/2017 12:42 PM
 */
public class Years  {
    public static void main(String[] args){
        //Declare Variables
        int minutes, days, years;

        //Set up Scanner
        Scanner in = new Scanner(System.in);

        //Minutes input
        System.out.print("Enter the number of minutes: ");
        minutes = in.nextInt();

        //New line for aesthetics
        System.out.println();

        //Total days
        days = minutes / (60 * 24);
        //Total Years
        years = days / 365;
        //Days Left
        days = days % 365;

        //Print Result
        System.out.printf("%s minutes is approximately %s years and %s days\n", minutes, years, days);
    }
}
