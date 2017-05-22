package study.thorjohansson.module4;
/**
 * Created by Thor Johansson on 5/21/2017.
 */

import java.util.Scanner;

public class FiveOrSix {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; i < 201; i++){
            if (i % 5 == 0 ^ i % 6 == 0){
                System.out.print(i + " ");
                counter++;
            }
            if(counter > 9){
                System.out.println();
                counter = 0;
            }
        }
    }
}
