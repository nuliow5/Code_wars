package lt.gerasimovas.digit_plus_one;

import java.util.Arrays;

public class DigitPlusOne {
    /*
        99 - 100
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(digitPlusOne(new int[]{1, 9})));
    }

    //1
    public static int[] digitPlusOne(int[] digits) {
        StringBuilder tempValue = new StringBuilder("");
        for (int i = 0; i < digits.length; i++) {
            tempValue.append(digits[i]);
        }
        int convertedToIntValue = Integer.parseInt(String.valueOf(tempValue)) + 1;
        int[] result = Integer.toString(convertedToIntValue).chars().map(c -> c-'0').toArray();
        return result;
    }

    //2
    public int[] returnDigitPlusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9){

            }
        }
        return null;
    }

}
