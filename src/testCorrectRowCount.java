import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testCorrectRowCount {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        CountRowsAndChars testklass = new CountRowsAndChars();
        testklass.count("a");
        testklass.count("a a");
        testklass.count("a a a");
        testklass.count("a a a a");
        testklass.count("a a a a a");
        testklass.count("stop");
        assertEquals(5, testklass.radAnt, "ska vara 5");
    }
}