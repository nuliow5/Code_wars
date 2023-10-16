package lt.gerasimovas.find_second_biggest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, -1, 3, 4, 0, 10));
        System.out.println(sortNumbers(numbers));
    }

    public static List<Integer> sortNumbers (List<Integer> numbers){
        Collections.sort(numbers, Collections.reverseOrder());
        return numbers;
    }
}
