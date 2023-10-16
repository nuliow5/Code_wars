package lt.gerasimovas.contain_dublicate;

// if array have duplicate, return true

import java.util.HashSet;
import java.util.Set;

public class DuplicateMain {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 2};
        int[] numbers1 = {0, 1, 2, 3, 4};
        duplicateContain(numbers);

    }

    public static boolean duplicateContain(int[] numbers) {
        Set<Integer> numbersSets = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbersSets.contains(numbers[i])) {
                return true;
            }
            numbersSets.add(numbers[i]);
        }
        return false;
    }
}
