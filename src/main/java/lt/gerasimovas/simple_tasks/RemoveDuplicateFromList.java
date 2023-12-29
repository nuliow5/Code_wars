package lt.gerasimovas.simple_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 1, 2));

        System.out.println(removeDuplicate(myList));

    }

    public static List<Integer> removeDuplicate(List<Integer> list){
        Set<Integer> uniqElements = new HashSet<>();

        uniqElements.addAll(list);

        List<Integer> result = new ArrayList<>(uniqElements);

        return result;
    }

}
