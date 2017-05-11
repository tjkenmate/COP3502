package study.thorjohansson.module3;

import java.util.Scanner;

/**
 * Created by Tjken on 5/11/2017.
 */
public class PointOnLine {
    public static void main(String[] args){
        double x0, x1, x2, y0, y1, y2;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        x0 = in.nextDouble();
        y0 = in.nextDouble();
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        if ((((x1-x0)*(y2-y0))-((x2-x0)*(y1-y0))) == 0)
            System.out.println("("+x2 +", "+ y2+") is on the line segment from ("+x0 +", "+ y0+") to ("+x1 +", "+ y1+")");
        else
            System.out.println("("+x2 +", "+ y2+") is NOT on the line segment from ("+x0 +", "+ y0+") to ("+x1 +", "+ y1+")");
    }
}
