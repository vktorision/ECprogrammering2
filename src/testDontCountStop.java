import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testDontCountStop {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        CountRowsAndChars testklass = new CountRowsAndChars();
        testklass.count("stop");
        assertEquals(0,
                testklass.ordAnt, "ska vara 0");
        assertEquals(0,
                testklass.radAnt, "ska vara 0");
        assertEquals(0,
                testklass.teckAnt, "ska vara 0");
        assertFalse(testklass.inteStop, "inteStop är falskt");
    }
}