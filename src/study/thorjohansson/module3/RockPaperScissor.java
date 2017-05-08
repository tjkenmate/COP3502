package study.thorjohansson.module3;

import java.util.Scanner;

/**
 * Created by Thor Johansson on .
 * Last edited on 5/8/2017 2:16 PM
 */
public class RockPaperScissor {
    public static void main (String[] args){
        int player, cpu;
        String result = "", playerChoice, cpuChoice;

        //Set up scanner
        Scanner in = new Scanner(System.in);

        //Gets user input
        System.out.print("scissor (0), rock (1), paper (2): ");
        player = in.nextInt();

        //catches for non choices
        if(player > 2 || player < 0)
            System.out.println("That is not a valid option");
        else{
            cpu = ((int)(Math.random()*10))%3;
            //sets the appropriate name
            switch (player){
                case 0: playerChoice = "scissor";
                    break;
                case 1: playerChoice = "rock";
                    break;
                case 2: playerChoice = "paper";
                    break;
                //Removes IDE Complaints
                default: playerChoice = null;
            }

            //sets the appropriate name
            switch (cpu){
                case 0: cpuChoice = "scissor";
                    break;
                case 1: cpuChoice = "rock";
                    break;
                case 2: cpuChoice = "paper";
                    break;
                //Removes IDE Complaints
                default: cpuChoice = null;
            }

            //Determines who won!
            switch (player - cpu) {
                //cases where player-cpu equals the computer wining
                case 2:
                case -1:
                    result = ". The computer won";
                    break;

                //cases where player-cpu equals the player wining
                case 1:
                case -2:
                    result = ". You won";
                    break;

                //cases where player-cpu equals a draw
                case 0:
                    result = " too. It's a draw";
                    break;
            }

            //Prints results
            System.out.println("The computer is " + cpuChoice + ". You are "+ playerChoice + result);
        }
    }
}
