package study.thorjohansson.module4;
/**
 * Created by Thor Johansson on 5/21/2017.
 */

import java.util.Scanner;

public class PatternB {
    public static void main(String[] args) {
        for(int i = 6; i > 0; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
