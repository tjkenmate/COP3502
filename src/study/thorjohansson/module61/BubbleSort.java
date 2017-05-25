package study.thorjohansson.module61;/**
 * Created by Thor Johansson on 5/24/2017.
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        double[] input = new double[10];

        //Set up Scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 10 numbers to sort: ");

        for(int i = 0; i < input.length; i++)
            input[i] = in.nextDouble();

        printArray(input);
    }

    public static void bubbleSort(double[] arrayToSort) {
        double temp;
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 1; j < (arrayToSort.length - i); j++) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    temp = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
    }

    public static void printArray(double[] array){
        for(double i: array)
            System.out.print(i+ " ");
    }
}
