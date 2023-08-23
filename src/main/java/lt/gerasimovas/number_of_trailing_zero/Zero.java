package lt.gerasimovas.number_of_trailing_zero;

import java.util.Arrays;

/*
    https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

    Write a program that will calculate the number of trailing zeros in a factorial of a given number.

    N! = 1 * 2 * 3 *  ... * N

    Be careful 1000! has 2568 digits...

    For more info, see: http://mathworld.wolfram.com/Factorial.html
 */
public class Zero {
    public static void main(String[] args) {
        System.out.println(zeros(6));  //1
        System.out.println(zeros(0));  //0
        System.out.println(zeros(12)); //2

    }

    public static int zeros(int n) {
        int multiplyResult = n;
        int result = 0;
        for (int i = n-1; i > 1; i--) {
            multiplyResult *= i;
        }
        int[] digits = Integer.toString(multiplyResult).chars().map(c -> c-'0').toArray();
        for (int i = digits.length-1; i > 0; i--){
            if (digits[i] == 0){
                result++;
            } else {
                break;
            }
        }
        System.out.println(multiplyResult);
        return result;
    }
}
