package lt.gerasimovas.simple_tasks;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str1 = {"flower", "flow", "flight", "flll"};
        String[] str2 = {"abc", "ab"};
        String[] str3 = {"a"};
        String[] str4 = {"cir","car"};

        System.out.println(longestCommonPrefix(str1)); // "fl"
        System.out.println(longestCommonPrefix(str2)); // "ab"
        System.out.println(longestCommonPrefix(str3)); // "a"
        System.out.println(longestCommonPrefix(str4)); // "c"

    }

    //1 surasti trumpiausia zodi
    //flow -> flw jeigu 3 raide yra w, tuomet saskins yra flow
    public static String longestCommonPrefix(String[] strs) {
        //find shortest word in array

        StringBuilder shortedWord = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            if (shortedWord.length() > strs[i].length()) {
                shortedWord.delete(0, shortedWord.length());
                shortedWord.append(strs[i]);
            }
        }
        StringBuilder result = new StringBuilder("");

        for (int i = shortedWord.length() - 1; i >= 0; i--) {
            int counter = 0;
            for (int j = 0; j < strs.length; j++) {
                if (shortedWord.charAt(i) == (strs[j].charAt(i))) {
                    counter++;
                }
            }
            if (counter == strs.length){
                result.append(shortedWord.charAt(i));
            } else {
                result.delete(0, result.length());
            }
        }

        result.reverse();

        return result.toString();

    }
}
