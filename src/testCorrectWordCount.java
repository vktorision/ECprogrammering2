import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testCorrectWordCount {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        CountRowsAndChars testklass = new CountRowsAndChars();
        testklass.count("abc abcd abcde");
        assertEquals(3,
                testklass.ordAnt, "ska vara 3");

    }
}