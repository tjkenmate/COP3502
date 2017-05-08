package study.thorjohansson.module3;

import java.util.Scanner;

/**
 * Created by Thor Johansson on .
 * Last edited on 5/8/2017 3:02 PM
 */
public class TrianglePerimeter {
    public static void main (String[] args){
        //Initialise and declare variables
        //NOTE: Integer.MIN_VALUE is being used to ingnore JVM errors, any number can be used
        int sideA = Integer.MIN_VALUE, sideB = Integer.MIN_VALUE,sideC = Integer.MIN_VALUE, perimeter = 0;
        boolean valid = true;

        Scanner in = new Scanner(System.in);

        System.out.print("Input the first sides length: ");
        sideA = in.nextInt();
        //checks if negative and stops everything
        if(valid && sideA < 0) {
            System.out.print("Input can not be negative");
            valid = false;
        }

        //only runs if still valid
        if(valid) {
            System.out.print("Input the second sides length: ");
            sideB = in.nextInt();
            //checks if negative and stops everything
            if(valid && sideB < 0) {
                System.out.print("Input can not be negative");
                valid = false;
            }
        }
        //only runs if still valid
        if(valid) {
            System.out.print("Input the third sides length: ");
            sideC = in.nextInt();
            //checks if negative and stops everything
            if(valid && sideC < 0) {
                System.out.print("Input can not be negative");
                valid = false;
            }
        }

        //Checks if Triangle exists
        if(valid && sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB)
            perimeter = sideA + sideB + sideC;
        else if(valid)
            //Sets perimeter to min value to single that the triangle does not exist
            perimeter = Integer.MIN_VALUE;
        if(valid && perimeter == Integer.MIN_VALUE) //Triangle DNE
            System.out.println("The input is invalid, triangle doesn't exist");
        else if (valid)
            System.out.println("The perimeter is " + perimeter);

    }
}
