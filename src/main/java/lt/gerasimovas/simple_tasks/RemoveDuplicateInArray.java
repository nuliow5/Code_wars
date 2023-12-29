package lt.gerasimovas.simple_tasks;

import java.util.*;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2};
        int[] myArray1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("LIST -----");
        System.out.println(Arrays.toString(removeDuplicate(myArray)));
        System.out.println(Arrays.toString(removeDuplicate(myArray1)));

        System.out.println("SET -----");
        System.out.println(Arrays.toString(removeDuplicateUsingSet(myArray)));
        System.out.println(Arrays.toString(removeDuplicateUsingSet(myArray1)));

    }

    //1 with List
    public static int[] removeDuplicate(int[] array) {
        List<Integer> uniqElementList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!uniqElementList.contains(array[i])) {
                uniqElementList.add(array[i]);
            }
        }

        int[] result = new int[uniqElementList.size()];
        for (int i = 0; i < uniqElementList.size(); i++) {
            result[i] = uniqElementList.get(i);
        }
        return result;
    }

    //2 with Set
    public static int[] removeDuplicateUsingSet(int[] array) {
        Set<Integer> uniqElements = new HashSet<>();
        for (int i : array) {
            uniqElements.add(i);
        }

        int[] result = new int[uniqElements.size()];
        int i = 0;
        for (int value : uniqElements) {
            result[i] = value;
            i++;
        }

        return result;
    }


}
