package CodeWarsTest;

import CodeWars.Scramblies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author fmucko
 */
class ScrambliesTest {
    @Test
    void scrambleTest() {
        assertAll(() -> assertTrue(Scramblies.scramble("rkqodlw", "world")),
                () -> assertTrue(Scramblies.scramble("cedewaraaossoqqyt", "codewars")),
                () -> assertFalse(Scramblies.scramble("scriptjavx", "javascript")),
                () -> assertFalse(Scramblies.scramble("javscripts", "javascript")));
    }

}