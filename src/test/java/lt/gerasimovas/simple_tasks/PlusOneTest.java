package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private static PlusOne plusOne;

    @Test
    void easyPlus() {
        int[] numbers = {1, 2, 3};

        int[] result = plusOne.plusOneInArray(numbers);

        assertEquals(Arrays.toString(new int[]{1, 2, 4}), Arrays.toString(result));
    }

    @Test
    void easyPlus9() {
        int[] numbers = {9};

        int[] result = plusOne.plusOneInArray(numbers);

        assertEquals(Arrays.toString(new int[]{1, 0}), Arrays.toString(result));
    }

    void easyPlus999() {
        int[] numbers = {9, 9, 9};

        int[] result = plusOne.plusOneInArray(numbers);

        assertEquals(Arrays.toString(new int[]{1, 0, 0, 0}), Arrays.toString(result));
    }
}