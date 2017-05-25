package study.thorjohansson.module61;/**
 * Created by Thor Johansson on 5/24/2017.
 */

import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        int[] input = new int[10], distinct = new int[10];
        int distinctCount = 0;
        //Set up Scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < input.length; i++) {
            input[i] = in.nextInt();
            distinct[i] = Integer.MIN_VALUE;
        }

        for(int i = 0; i < input.length; i++){
            boolean exists = false;
            for (int j: distinct) {
                if (j == input[i]) {
                    exists = true;
                    break;
                }
            }

            if(!exists){
                distinct[distinctCount] = input[i];
                distinctCount++;
            }

            exists = false;
        }

        System.out.println("The number of distinct number is " + distinctCount);

        System.out.print("The distinct numbers are:");
        for(int i: distinct)
            if(i != Integer.MIN_VALUE)
                System.out.print(" "+i);
    }
}
