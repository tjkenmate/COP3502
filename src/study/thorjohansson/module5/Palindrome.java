package study.thorjohansson.module5;/**
 * Created by Thor Johansson on 5/22/2017.
 */

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(323));
        System.out.println(isPalindrome(879522235));
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
}
