package lt.gerasimovas.simple_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10,11,30));

        List<String> names = new ArrayList<>(List.of("One", "Pavel", "Eduard"));

        System.out.println(Collections.max(numbers)); //30
        System.out.println(Collections.max(names)); //Pavel ? why
        System.out.println(Collections.max(names, Comparator.comparing(String::length))); //Eduard

    }
}
