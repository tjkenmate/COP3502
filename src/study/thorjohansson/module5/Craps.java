package study.thorjohansson.module5;/**
 * Created by Thor Johansson on 5/22/2017.
 */

import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        if(craps())
            System.out.println("You Win");
        else
            System.out.println("You Lose");
    }

    public static boolean craps(){
        int dice1 = roll();
        int dice2 = roll();
        System.out.println("You rolled "+dice1+" + "+dice2+" = "+(dice1+dice2));
        if(dice1+dice2 == 7 || dice1+dice2 == 11)
            return true;
        else if(dice1+dice2 == 2 || dice1+dice2 == 3 || dice1+dice2 == 12)
            return false;
        else {
            System.out.println("point is "+(dice1+dice2));
            return craps(dice1 + dice2);
        }
    }

    public static boolean craps(int number){
        int dice1 = roll();
        int dice2 = roll();
        System.out.println("You rolled "+dice1+" + "+dice2+" = "+(dice1+dice2));
        if(dice1+dice2 == number)
            return true;
        else if(dice1+dice2 == 7)
            return false;
        else
            return craps(number);
    }

    public static int roll(){
        return ((int)(Math.random()*100))%5+1;
    }
}
