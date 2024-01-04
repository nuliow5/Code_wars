package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceTest {

    private static FirstOccurrence firstOccurrence;

    @Test
    void strStr1() {
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = firstOccurrence.strStr(haystack, needle);
        assertEquals(0, result);
    }

    @Test
    void strStr2() {
        String haystack = "mississippi";
        String needle = "issip";

        int result = firstOccurrence.strStr(haystack, needle);
        assertEquals(4, result);
    }

    @Test
    void strStr3() {
        String haystack = "a";
        String needle = "a";

        int result = firstOccurrence.strStr(haystack, needle);
        assertEquals(0, result);
    }

    @Test
    void strStr4() {
        String haystack = "aaa";
        String needle = "aaaa";

        int result = firstOccurrence.strStr(haystack, needle);
        assertEquals(-1, result);
    }

    @Test
    void strStr5() {
        String haystack = "mississippi";
        String needle = "issipi";

        int result = firstOccurrence.strStr(haystack, needle);
        assertEquals(-1, result);
    }

    @Test
    void strStr6() {
        String haystack = "babbbbbabb";
        String needle = "bbab";

        int result = firstOccurrence.strStr(haystack, needle);
        assertEquals(5, result);
    }
}