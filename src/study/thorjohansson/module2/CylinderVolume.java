//package study.thorjohansson.module2;

import java.util.Scanner;

/**
 * Created by Thor Johansson on 5/8/2017.
 * Last edited on 5/8/2017 12:42 PM
 */
public class CylinderVolume {
    public static void main(String[] args){
        //Declare variables
        double radius, length, area, volume;

        //Set up scanner
        Scanner input = new Scanner(System.in);

        //Radius Input
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        //New line for aesthetics
        System.out.println();

        //Calculate area and store it
        area = Math.pow(radius, 2) * Math.PI;
        //Calculate volume and store it
        volume = area * length;

        //Print Statements
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
