package PracticeSet.atlaslearnings.day36.Test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCase02 {

    @Test
    @Tag("firstPriority")
    void testMethod01() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        assertEquals("hello", "he" + "llo");
    }

    @Test
    @Tag("fastTag")
    void testMethod03() {
        assertEquals(true, 5 > 3);
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        assertEquals(9, 3 * 3);
    }
}
