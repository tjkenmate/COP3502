package study.thorjohansson.module3;

import java.util.Scanner;

/**
 * Created by Thor Johansson on .
 * Last edited on 5/8/2017 4:08 PM
 */
public class Windchill {
    public static void main (String[] args){
        double result, temperature, velocity;

        //Set up inpit
        Scanner in = new Scanner(System.in);

        //temperature Input
        System.out.print("Input a temperature between -58 - 41: ");
        temperature = in.nextDouble();

        //Check if temperature is invalid
        if(temperature > 41 || temperature < -58)
            System.out.println("The temperature is invalid");
        else {
            //Velocity Input
            System.out.print("Input a velocity between 0 - 2: ");
            velocity = in.nextDouble();
            //Check if velocity is valid
            if(velocity <= 2.0 && velocity > 2){
                //Calculate and print result
                result = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(velocity, 0.16) + 0.4275 * temperature * Math.pow(velocity, 0.16);
                System.out.print("The wind chill temperature is: " + result);
            }
            else
                System.out.print("The Velocity is invalid");
        }
    }
}
