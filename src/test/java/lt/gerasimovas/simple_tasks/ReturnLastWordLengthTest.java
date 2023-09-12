package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnLastWordLengthTest {
    private static ReturnLastWordLength returnLastWordLength;

    @BeforeAll
    static void setUp() {
        returnLastWordLength = new ReturnLastWordLength();
    }

    @Test
    void lastWordEqualFour() {
        String text = "Hello World";
        int result = returnLastWordLength.findLastWordLength(text);
        assertEquals(5, result);
    }

    @Test
    void lastWordEqualThree() {
        String text = "aaa aa aaaaa a aaa";
        int result = returnLastWordLength.findLastWordLength(text);
        assertEquals(3, result);
    }

}