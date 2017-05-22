package study.thorjohansson.module4;
/**
 * Created by Thor Johansson on 5/21/2017.
 */

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        //Draw header and boarder
        System.out.println("|--------------------|");
        System.out.println("| Miles | Kilometers |");
        System.out.println("|--------------------|");

        //calculate miles and KM from 1-10 miles
        for(int mile = 1; mile < 11; mile++)
            System.out.printf("| %-5d | %10.3f |\n", mile, mile * 1.609);
        System.out.println("|--------------------|");
        //Draw bottom of table
    }
}
