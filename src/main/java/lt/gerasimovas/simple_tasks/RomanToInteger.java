package lt.gerasimovas.simple_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("6: " + romanToInt("VI"));
        System.out.println("4: " + romanToInt("IV"));
        System.out.println("7: " + romanToInt("VII"));
        System.out.println("3: " + romanToInt("III"));
        System.out.println("1994: " + romanToInt("MCMXCIV"));
        System.out.println("1: " + romanToInt("I"));
        System.out.println("Error: " + romanToInt("ABCD"));
    }

    public static int romanToInt(String s) {
        String romain = s.toUpperCase().trim();

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < romain.length(); i++){
            if (!romanMap.containsKey(romain.charAt(i))){
                throw new NullPointerException("Wrong Roman symbol");
            }
            if (i < romain.length() - 1 && romanMap.get(romain.charAt(i)) < romanMap.get(romain.charAt(i+1))){
                result -= romanMap.get(romain.charAt(i));
            } else {
                result += romanMap.get(romain.charAt(i));
            }
        }


        return result;

    }

}
