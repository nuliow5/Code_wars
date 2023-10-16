package lt.gerasimovas.find_second_biggest;


import java.util.Arrays;


public class SolutionBiggestElement {
    public static void main(String[] args) {
        int[] array = {5, 7, 1, 2, 0, -1, 10}; //7
        int[] array1 = {5, 7, 1, 2, 0, -1, 10}; //7

        System.out.println(findSecondBiggestElementUsingSort(array));
        System.out.println(findSecondBiggestElement(array));

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(sortFromLowToHeight(array)));

        System.out.println(Arrays.toString(sortFromHeightToLow(array)));
        System.out.println("bubble: " + Arrays.toString(bubbleSort(array)));


    }

    public static int findSecondBiggestElementUsingSort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }

    public static int findSecondBiggestElement(int[] numbers) {
        int max = numbers[0];
        int secondMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            }
        }
        return secondMax;
    }

    public static int[] sortFromLowToHeight(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                int temp = min;
                min = numbers[i];
                numbers[i] = temp;
            }
        }

        return numbers;
    }

    public static int[] sortFromHeightToLow(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++)
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
        }

        return numbers;
    }

    static int[] bubbleSort(int[] arr) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }

        return arr;
    }

}
