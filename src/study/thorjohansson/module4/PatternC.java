package study.thorjohansson.module4;
/**
 * Created by Thor Johansson on 5/21/2017.
 */

public class PatternC {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int j = 6; j > i; j--)
                System.out.print("  ");
            for(int k = i; k > 0; k--)
                System.out.print(k +" ");
            System.out.println();
        }
    }
}
