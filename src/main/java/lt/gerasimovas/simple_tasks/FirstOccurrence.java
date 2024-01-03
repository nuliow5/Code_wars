package lt.gerasimovas.simple_tasks;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        String haystack1 = "mississippi";
        String needle1 = "issip";


//        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack1, needle1));

    }
    //todo fix bug
    public static int strStr(String haystack, String needle) {
        int result = -1;
        int j = 0;
        int tryCount = 0;
        int breakIndex = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (tryCount == 0) {
                    breakIndex = i;
                }
                if (j == needle.length() - 1) {
                    result = i - (needle.length() - 1);
                    break;
                }
                tryCount++;
                j++;
            } else {
                j = 0;
            }
        }

        return result;
    }

}
