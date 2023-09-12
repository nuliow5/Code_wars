package lt.gerasimovas.digit_plus_one;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitPlusOneTest {
    private static DigitPlusOne digitPlusOne;

    @BeforeAll
    static void setUp() {
        digitPlusOne = new DigitPlusOne();
    }

    @Test
    void plusOneIsNine() {
        int[] digits = {8};
        int[] result = digitPlusOne.returnDigitPlusOne(digits);
        assertEquals(new int[]{9}, result);
    }

    @Test
    void plusOneIsTen() {
        int[] digits = {9};
        int[] result = digitPlusOne.returnDigitPlusOne(digits);
        assertEquals(new int[]{1, 0}, result);
    }

    @Test
    void plusOneIsTwenty() {
        int[] digits = {1, 9};
        int[] result = digitPlusOne.returnDigitPlusOne(digits);
        assertEquals(new int[]{2, 0}, result);
    }


}
