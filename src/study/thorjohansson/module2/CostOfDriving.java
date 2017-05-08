package study.thorjohansson.module2;

import java.util.Scanner;

/**
 * Created by Thor Johansson on 5/8/2017.
 * Last edited on 5/8/2017 1:05 PM
 */
public class CostOfDriving {
    public static void main(String[] args){
        //Declare Variables
        double distance, milesPerGallon, gallons, pricePerGallon, cost;

        //Setup Scanner
        Scanner in = new Scanner(System.in);

        //distance input
        System.out.print("Enter the driving distance: ");
        distance = in.nextDouble();

        //New line for aesthetics
        System.out.println();

        //miles per gallon input
        System.out.print("Enter miles per gallon: ");
        milesPerGallon = in.nextDouble();

        //New line for aesthetics
        System.out.println();

        //Price per gallon input
        System.out.print("Enter price per gallon: ");
        pricePerGallon = in.nextDouble();

        //New line for aesthetics
        System.out.println();

        //Calc the amount of gallons then the cost
        gallons = distance / milesPerGallon;
        cost = gallons * pricePerGallon;

        //Print Result
        System.out.printf("The cost of driving is $%.2f", cost);
    }
}
