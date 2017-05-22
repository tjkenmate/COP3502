package study.thorjohansson.module5;/**
 * Created by Thor Johansson on 5/22/2017.
 */

import java.util.Scanner;

public class PalindromicPrime {
    public static void main(String[] args) {
        System.out.println(isPalindromicPrime(2));
        System.out.println(isPalindromicPrime(3));
        System.out.println(isPalindromicPrime(4));
        System.out.println(isPalindromicPrime(283));
        System.out.println(isPalindromicPrime(151));
        System.out.println(isPalindromicPrime(171));
    }

    public static int reverse(int number){
        String reverse = "";
        int counter = new String(number+"").length();
        for(int i = 1; i <= counter; i++){
            reverse += new String(number + "").charAt(counter-i);
        }
        return Integer.parseInt(reverse);
    }

    public static boolean isPalindrome(int number){
        if(number == reverse(number))
            return true;
        return false;
    }

    public static boolean isPrime(int number){
        if(number == 2)
            return true;
        for(int i = 2; i < number; i++)
            if(number%i == 0)
                return false;
        return true;
    }

    public static boolean isPalindromicPrime(int number){
        if(isPalindrome(number)&&isPrime(number))
            return true;
        return false;
    }
}
