//package study.thorjohansson.module2;

/**
 * Created by Tjken on 5/14/2017.
 */
public class MathBehavior {
    public static void main(String[] args){
        /*
         * 23/5 is equal to 4
         * This is due to Integer Division dividing whole number while leaving a remainder.
         * To obtain the remainder you use % instead of /
         *
         * 23/5.0 is equal 4.6
         * this is because one of the two numbers is a double and will preform floating point division
         */
        System.out.println("23/5 is " + 23/5);
        System.out.println("23/5.0 is " + 23/5.0);
    }
}
