package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

public class NumbersSquared {
    public static void main(String[] args) {
        int[] array = {-3, 2, 5};
        int[] array2 = {-3, -2, 0, 1, 5}; //0, 1, 4, 9, 25
//        System.out.println(Arrays.toString(squareUp(array)));
        System.out.println(Arrays.toString(squareUp(array2)));
    }

    public static int[] squareUp(int[] numbers) {
        int[] result = new int[numbers.length];
        int left = 0;
        int right = numbers.length - 1;
        int i = numbers.length - 1;
        while (left <= right) {
            if (Math.abs(numbers[left]) > Math.abs(numbers[right])) {
                result[i] = numbers[left] * numbers[left];
                i--;
                left++;
            } else {
                result[i] = numbers[right] * numbers[right];
                i--;
                right--;
            }
        }
        return result;
    }
}
