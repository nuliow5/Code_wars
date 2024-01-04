package lt.gerasimovas;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        // \u000d System.out.println("Hello World!");

        int num1 = 2;
        int num2 = 3;

        num1 = num2 ^ num1;
        System.out.println("num1= " + num1);

        List<Integer> myList = new LinkedList<>();
        List<Integer> myList1 = new ArrayList<>();

        StringBuilder shortedWord = new StringBuilder("labas");
        shortedWord.delete(0, shortedWord.length());
        shortedWord.append("viso");
        System.out.println(shortedWord);

        String flower = "abc";
        String flow = "ab";



//        System.out.println(flower.charAt(1) == flow.charAt(1));

        StringBuilder result = new StringBuilder("");
        result.insert(0, flow.charAt(0));
        result.insert(0, flow.charAt(1));


        System.out.println(":::: " + result);



    }
}
