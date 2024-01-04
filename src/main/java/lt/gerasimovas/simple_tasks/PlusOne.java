package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers1 = {9, 9, 9};
        int[] numbers2 = {8, 9, 9, 9};
        int[] numbers3 = {9};

        System.out.println(Arrays.toString(plusOneInArray(numbers)));
        System.out.println(Arrays.toString(plusOneInArray(numbers1)));
        System.out.println(Arrays.toString(plusOneInArray(numbers2)));
        System.out.println(Arrays.toString(plusOneInArray(numbers3)));

    }

    public static int[] plusOneInArray(int[] digits) {
        int[] result;

//        if (digits[digits.length - 1] != 9) {
//            digits[digits.length - 1]++;
//            return digits;
//        }

        int memory = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] == 9 && i==0){
                result = new int[digits.length+1];
                result[0] = 1;
                return result;
            }

            if (digits[i] == 9){
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}
