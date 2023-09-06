package lt.gerasimovas.sweeebank_tasks.task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] fistArray = {8, 8, 8, 7, 7, 7, 7, 7, 7, 7, -8, -8};
        int[] secondArray = {-5, 1, 1, 4, 4, 4, 7, 4, 6};
        int[] xxx = {-5, 0, 0, 4, 4, 7, 7, 4, 7};

        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

//        System.out.println(fistArray.length/3);
//        Arrays.sort(fistArray);
//        System.out.println(Arrays.toString(fistArray));

        System.out.println("RESULT = " + solution(secondArray, 6));


    }

    //  -5, 1, 1, 4, 4, 4, 4, 6, 7
    //  -5, 0, 0, 4, 4, 4, 7, 7, 7


    public static int solution(int[] A, int K) {
        Arrays.sort(A);
        System.out.println("sorted array: " + Arrays.toString(A));
        int lengthDivisibleByThree = A.length / 3;

        System.out.println("lengthDivisibleByThree = " + lengthDivisibleByThree);


        for (int i = lengthDivisibleByThree - 1; i > 0; i--) {
            if (K > 0) {
                A[i]--;
                K--;
            } else {
                break;
            }
        }


        while (K > 0) {
            for (int i = 0; i < lengthDivisibleByThree - 1; i++) {
                A[A.length - 2 - i]++;
                K--;
                if (K == 0) {
                    break;
                }

            }
        }


        Arrays.sort(A);
        System.out.println("sorted array: " + Arrays.toString(A));

        System.out.println("K" + K);


        int minElement = A[lengthDivisibleByThree + 1];
        int maxElement = A[A.length - lengthDivisibleByThree];

        System.out.println("min element " + minElement);
        System.out.println("max element " + maxElement);

        int result = maxElement - minElement;

        return result;
    }
}
