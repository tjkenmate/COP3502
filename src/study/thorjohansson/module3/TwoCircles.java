package study.thorjohansson.module3;

import java.util.Scanner;

/**
 * Created by Tjken on 5/11/2017.
 */
public class TwoCircles {
    public static void main (String[] args){
        //Set up variables
        double x1, x2, y1, y2, r1, r2, distanceInBetween;
        //set up scanner
        Scanner in = new Scanner(System.in);

        //input circle one information
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        r1 = in.nextDouble();

        //input circle two information
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        r2 = in.nextDouble();

        //calculate the distance between the two centers of the circless
        distanceInBetween = Math.abs(Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)));

        //if the distance between the two centers is less than the radius then the if statement is true
        if(distanceInBetween <= Math.abs(r1-r2))
            System.out.println("circle2 is inside circle1");
        //if the distance between the two centers is less than the sum of the two radi than the else if statement is true
        else if (distanceInBetween<= r1 + r2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
