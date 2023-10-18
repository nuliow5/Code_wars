package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

public class CoordinateOfElement {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 8, 10};

        //test
        /*
            if element = 8 return [3, 5]
            if element = 7 return [1, 2]
            if element = 5 return [0, 0]
            if element = 2 return [-1, -1]
         */

        int[] answer = returnFirstAndLastPositionOfElement(numbers, 3);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] returnFirstAndLastPositionOfElement(int[] numbers, int element) {
        int[] result = {-1, -1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > element){
                break;
            }
            if (numbers[i] == element){
                if (result[0] == -1){
                    result[0] = i;
                } else {
                    result[1] = i;
                }
            }
        }

        if (result[0] != -1 && result[1] == -1){
            result[1] = result[0];
        }

        return result;
    }

}
