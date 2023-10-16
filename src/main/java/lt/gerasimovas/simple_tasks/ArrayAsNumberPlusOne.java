package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

public class ArrayAsNumberPlusOne {
    public static void main(String[] args) {
        int[] firstArray = {1, 0, 0};
        int[] secondArray = {2, 9, 9};
        int[] thirdArray = {9, 9};

        System.out.println(Arrays.toString(plusOne(firstArray)));
        System.out.println(Arrays.toString(plusOne(secondArray)));
        System.out.println(Arrays.toString(plusOne(thirdArray)));

    }

    public static int[] plusOne(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 9) {
                numbers[i] = 0;
            } else {
                numbers[i]++;
                return numbers;
            }

        }
        int[] newArray = new int[numbers.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}
