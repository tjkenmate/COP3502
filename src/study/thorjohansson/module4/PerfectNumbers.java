package study.thorjohansson.module4;/**
 * Created by Thor Johansson on 5/21/2017.
 */

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i < 10000; i++){
            for(int j = 1; j < i; j++)
                if(i % j == 0)
                    sum += j;
            if(sum != 0 && sum == i)
                System.out.println(i);
            sum = 0;
        }
    }
}
