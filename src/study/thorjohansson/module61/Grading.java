package study.thorjohansson.module61;/**
 * Created by Thor Johansson on 5/23/2017.
 */

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int arraySize = 0, best = 0;
        //Set up Scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        arraySize = in.nextInt();

        System.out.print("Enter " + arraySize + " scores: ");
        int[] grades = new int[arraySize];
        for(int i = 0; i < arraySize; i++)
            grades[i] = in.nextInt();
        for(int i: grades){
            if(best < i)
                best = i;
        }

        for(int i = 0; i < arraySize; i++){
            if(grades[i] >= best - 10)
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is A");
            else if(grades[i] >= best - 20)
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is B");
            else if(grades[i] >= best - 30)
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is C");
            else if(grades[i] >= best - 40)
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is D");
            else
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is F");
        }
    }
}
