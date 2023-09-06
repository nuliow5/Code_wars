package lt.gerasimovas.zero_in_array;

import java.util.Arrays;
import java.util.Collections;

public class Zero {
    public static void main(String[] args) {
        int[] myArray = {0, 2, 4, 0, 5};

        System.out.println(Arrays.toString(pushZeroesToTheEnd(myArray)));
    }

    public static int[] pushZeroesToTheEnd(int[] array) {
        int[] resultArray = new int[array.length];
        int zeroCounter = 0;

        for (int i = 0; i < array.length; i++) {

                if (array[i] == 0) {
                    resultArray[array.length-1-zeroCounter] = array[i];
                    zeroCounter++;
                } else {
                    resultArray[i-zeroCounter] = array[i];
                }


        }
        return resultArray;
    }
}
