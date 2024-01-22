package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {
    private static LongestSubstringWithoutRepeating l = new LongestSubstringWithoutRepeating();
    @Test
    void lengthOfLongestSubstring(String s){
        int result = l.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

}