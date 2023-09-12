package lt.gerasimovas.simple_tasks;

import java.util.Arrays;

/*
    find last word in String length
    "Hello World" = 5
 */
public class ReturnLastWordLength {
    public int findLastWordLength(String text){
        String[] words = text.split(" ");
        int result = words[words.length-1].length();
        return result;
    }
}


