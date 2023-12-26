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
        int low = 0;
        int high = numbers.length - 1;

        while (low >= high){
            //todo
        }
        return null;
    }


    public static int[] squareUp1(int[] numbers) {
        int[] result = new int[numbers.length];
        int countNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                int modul = numbers[i] * -1;
                //cheking whare is modul spote is
                for (int j = i + 1; j < numbers.length; j++) {
                    if (modul <= numbers[j]) {
                        int newSpot = j - 1;
                        result[newSpot - countNegative] = numbers[i] * numbers[i];
                        countNegative++;
//                        for (int k = i; k < newSpot; k++) {
//                           numbers[k] = numbers[k+1] * numbers[k+1];
//                        }
//                        numbers[newSpot] = modul * modul;
//                        i--;
                    }
                }

            } else {
                result[i] = numbers[i] * numbers[i];
            }


        }

        return result;
    }

    public static int[] squareUp2(int[] numbers) {
        int[] result = new int[numbers.length];
        int modul;
        int spot;
        int countArrayTransform = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                modul = numbers[i] * -1;
                for (int j = i + 1; j < numbers.length - countArrayTransform; j++) {
                    if (numbers[j] >= modul) {
                        spot = j - 1;
                        numbers[spot] = modul; //spot

                    } else {
                        numbers[j - 1] = numbers[j];
                    }
                }
                countArrayTransform++;
                i--;
            }
        }

        return numbers;
    }
}
