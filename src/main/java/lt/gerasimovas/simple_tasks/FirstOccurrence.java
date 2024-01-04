package lt.gerasimovas.simple_tasks;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 yra parasytas testas
 */
public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        String haystack1 = "mississippi";
        String needle1 = "issip";

        System.out.println("mississippi " + haystack1.length());

        String haystack2 = "a";
        String needle2 = "a";

        String haystack3 = "aaa";
        String needle3 = "aaaa";

        String haystack4 = "mississippi";
        String needle4 = "issipi";

        String haystack5 = "babbbbbabb";
        String needle5 = "bbab";


        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
        System.out.println(strStr(haystack4, needle4));
        System.out.println(strStr(haystack5, needle5));

    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }

        if (haystack.isEmpty() || needle.length() > haystack.length()){
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;

    }

}
