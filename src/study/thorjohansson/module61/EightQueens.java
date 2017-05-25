package study.thorjohansson.module61;/**
 * Created by Thor Johansson on 5/24/2017.
 */

import java.util.Scanner;

public class EightQueens {
    public static void main(String[] args) {
        char[][] board = {
                { 'Q', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', 'Q', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'Q' },
                { ' ', ' ', ' ', ' ', ' ', 'Q', ' ', ' ' },
                { ' ', ' ', 'Q', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', 'Q', ' ' },
                { ' ', 'Q', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', 'Q', ' ', ' ', ' ', ' ' }, };

        print2DArray(board,"","|", "");
    }

    /**
     * Standard and easily modifiable multi use non formatted print method for 2d arrays/lists
     *
     * By Thor Johansson
     *
     * @param array the 2d array/list to print
     * @param prefix String to print infront of the line
     * @param separator String to print after each object in the 2d array
     * @param suffix String to put at the end before a new line
     *
     **/
    public static void print2DArray(char[][] array, String prefix, String separator, String suffix){
        for(char[] nest: array){
            System.out.print(prefix + separator);
            for(char a: nest)
                System.out.print(a + separator);
            System.out.print(suffix+"\n");
        }
    }
}
