package study.thorjohansson.module62;/**
 * Created by Thor Johansson on 5/25/2017.
 */

import java.util.Scanner;

public class SumByColumn {
    public static void main(String[] args) {
        double[][] m = new double[3][4];
        //Set up Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row:");

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                m[i][j] = in.nextDouble();
        }

        for(int i = 0; i < 4; i++)
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
