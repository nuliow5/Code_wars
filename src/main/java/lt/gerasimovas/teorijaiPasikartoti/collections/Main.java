package lt.gerasimovas.teorijaiPasikartoti.collections;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(of(10, 15, -5));

        System.out.println(myList);


        Integer integerValue1 = 15;
        Integer integerValue2 = 30;

        System.out.println(integerValue1.compareTo(integerValue2));

    }

}
