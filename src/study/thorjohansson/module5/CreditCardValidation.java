package study.thorjohansson.module5;/**
 * Created by Thor Johansson on 5/22/2017.
 */

import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
        long input;

        //Set up Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer:");
        input = in.nextLong();

        if(isValid(input))
            System.out.println(input+ " is valid");
        else
            System.out.println(input+ " is not valid");

    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        int numberLength = new String(number+"").length();
        if(12 < numberLength && numberLength < 17)
            if(getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 2) == 37 || getPrefix(number, 1) == 6)
                if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10 == 0)
                    return true;
        return false;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        String a = number+"";
        int sum = 0;
        for (int i = 0; i < a.length(); i++){
            if(i%2 == 0)
                sum += getDigit(Integer.parseInt(new String(a.charAt(i)+""))*2);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        if(new String(number+"").length() == 2)
            return number%10 + number/10;
        return number;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        String a = number+"";
        int sum = 0;
        boolean evenLength = a.length()%2 == 0;
        for(int i = 0; i < a.length(); i++){
            if(evenLength && i%2 != 0)
                sum += Integer.parseInt(new String(a.charAt(i)+""));
            else if (!evenLength && i%2 == 0)
                sum += Integer.parseInt(new String(a.charAt(i)+""));
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d){
        if(getPrefix(number, new String(d+"").length()) == d)
            return true;
        return false;
    }

    public static int getSize(long d){
        return new String(d+"").length();
    }

    public static long getPrefix(long number, int k){
        if (k > getSize(number))
            return number;
        else
            return Long.parseLong(new String(number + "").substring(0,k));
    }
}
