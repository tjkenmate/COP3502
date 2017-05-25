package study.thorjohansson.module62;
/**
 * Created by Thor Johansson on 5/25/2017.
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        /*
         *   When State is 0 the game is running
         *   When State is 1 Player 1 wins
         *   When State is 2 Plater 2 wins
         *   When State is 3 its a draw
         */
        byte state = 0;
        boolean playerXTurn = true;
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        do{
            print2DArray(board, "", "|", "", "-------\n");
            state = move(playerXTurn, board);
            playerXTurn = turnSwitch(playerXTurn);
        } while (state == 0);
        print2DArray(board, "", "|", "", "-------\n");
        switch (state) {
            case 1: print("X player won");
            case 2: print("O player won");
            case 3: print("draw");
        }
    }

    public static byte move(boolean playerXTurn, char[][] board){
        byte i, j;

        //Set up Scanner
        Scanner in = new Scanner(System.in);
        if(playerXTurn){
            print("Enter a row (0, 1, or 2) for player X: ", false);
            i = in.nextByte();
            print("Enter a column (0, 1, or 2) for player X: ", false);
            j = in.nextByte();
            if(i > 2 && j >2 && !isValid(board[i][j])) {
                print("Input is not valid");
                return move(playerXTurn, board);
            }
            board[i][j] = 'X';
        } else{
            print("Enter a row (0, 1, or 2) for player O: ", false);
            i = in.nextByte();
            print("Enter a column (0, 1, or 2) for player O: ", false);
            j = in.nextByte();
            if(i > 2 && j >2 && !isValid(board[i][j])) {
                print("Input is not valid");
                return move(playerXTurn, board);
            }
            board[i][j] = 'O';
        }
        return gameState(board);

    }

    public static byte gameState(char[][] board) {
        byte state;
        for(int i = 0; i < 3; i++) {
            if (!(board[i][0] == ' ') && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return state = (byte) ((board[i][0] == 'X') ? 1 : 2);
            if (!(board[0][i] == ' ') && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return state = (byte) ((board[0][i] == 'X') ? 1 : 2);
        }
        if(!(board[0][0] == ' ') && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return state = (byte) ((board[0][0] == 'X') ? 1 : 2);
        if(!(board[0][2] == ' ') && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return state = (byte) ((board[0][2] == 'X') ? 1 : 2);
        for(char[] row: board)
            for(char box: row)
                if(box == ' ')
                    return 0;
        return 3;
    }

    public static boolean turnSwitch(boolean playerXTurn){
        return !playerXTurn;
    }

    public static void print(String a){
        print(a, true);
    }

    public static void print(String a, boolean newline){
        if(newline)
            System.out.println(a);
        else
            System.out.print(a);
    }

    public static boolean isValid(char a){
        return (a == ' ');
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
     * @param inbetween String to put inbetween each line
     *
     **/
    public static void print2DArray(char[][] array, String prefix, String separator, String suffix, String inbetween){
        System.out.print(inbetween);
        for(char[] nest: array){
            System.out.print(prefix + separator);
            for(char a: nest)
                System.out.print(a + separator);
            System.out.print(suffix+"\n" + inbetween);
        }
    }
}
