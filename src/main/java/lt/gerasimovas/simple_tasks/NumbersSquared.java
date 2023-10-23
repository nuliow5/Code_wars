package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

public class NumbersSquared {
    public static void main(String[] args) {
        int[] array = {-3, 2, 5};

        System.out.println(Arrays.toString(squareUp(array)));
    }
    //todo
    public static int[] squareUp(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                int modul = numbers[i] * -1;

                for (int j = i + 1; j < numbers.length; j++) {
                    if (modul >= numbers[j]) {
                        int newSpot = j-1;

                        for (int k = i; k < newSpot; k++) {
                           numbers[k] = numbers[k+1];
                        }
                        numbers[newSpot] = modul * modul;
                    }
                }

            } else {
                numbers[i] *= numbers[i];
            }


        }

        return numbers;
    }
}
