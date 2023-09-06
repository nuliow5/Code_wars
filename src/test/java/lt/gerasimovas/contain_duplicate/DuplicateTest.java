package lt.gerasimovas.contain_duplicate;

import lt.gerasimovas.contain_dublicate.DuplicateMain;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DuplicateTest {
    private static DuplicateMain duplicateMain;

    @BeforeAll
    static void setUp() {
        duplicateMain = new DuplicateMain();
    }


    @Test
    void doesDuplicate() {
        int[] numbers = {0, 1, 2, 3, 2};
        boolean isDuplicate = duplicateMain.duplicateContain(numbers);
//        assertEquals(true, isDuplicate);
        assertTrue(isDuplicate);
    }

}
