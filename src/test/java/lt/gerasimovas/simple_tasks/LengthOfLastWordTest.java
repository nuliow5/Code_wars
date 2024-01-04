package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    private LengthOfLastWordInString lengthOfLastWordInString;
    @Test
    void lengthOfLastWord() {
        String words = "Hello World";
        int result = lengthOfLastWordInString.lengthOfLastWord(words);
        assertEquals(5, result);
    }

    @Test
    void lengthOfLastWord1() {
        String words = "   fly me   to   the moon  ";
        int result = lengthOfLastWordInString.lengthOfLastWord(words);
        assertEquals(4, result);
    }

    @Test
    void lengthOfLastWord2() {
        String words = "luffy is still joyboy";
        int result = lengthOfLastWordInString.lengthOfLastWord(words);
        assertEquals(6, result);
    }
}