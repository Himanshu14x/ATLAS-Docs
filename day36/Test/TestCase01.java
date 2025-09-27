package PracticeSet.atlaslearnings.day36.Test;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class TestCase01 {
    @Test
    public void Testcase1() {
        String str = "Himanshu";
        assertEquals("Himanshu", str);
    }
    private int testcase2() {
        return 10;
    }
    @Test
    void Testcase2() {
        boolean condition = "true".equalsIgnoreCase(System.getProperty("runTest"));
        Assumptions.assumeTrue(condition, "as the condition is not met skip test case");
        int result = testcase2();
        Assertions.assertEquals(10, result, "value need to be 10");
    }


    @ParameterizedTest
    @ValueSource(ints = {100, 25, 30, 70, 40})
    void testSquare(int value) {
        int result = square(value);
        assertEquals(value * value, result, " if wrong");
    }


    private int square(int number) {
        return number * number;
    }


    @TestFactory
    Collection<DynamicTest> DynamicTestCase() {
        return TestCases().map(val ->
                dynamicTest("Dynamic Test:  " + val, () -> assertTrue(val % 2 == 0))
        ).toList();
    }
    @Test
    @Tag("slow")
    void slowTest() {
        assertTrue(true, "slow test method");
    }


    @Test
    @Tag("fast")
    void fastTest() {
        assertTrue(true, "fast test method");
    }


    @Test
    @Tag("fast")
    @Tag("integration")
    void fastIntegrationTest() {
        assertTrue(true, "fast integration test methid");
    }


    @Test
    void test2() {
        System.out.println("sample test method");


    }

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("run it b4 all tests");
    }


    @AfterAll
    static void cleanupAfterAll() {
        System.out.println("run it after all tests");
    }


    @BeforeEach
    void setupBeforeEach() {
        System.out.println("run it b4 each test");
        int val1 = 10;
        int val2 = 5;


    }


    @AfterEach
    void cleanupAfterEach() {
        System.out.println("run it after each test");
    }



    @Test
    void test() {
        int val1 = 30;
        int val2 = -25;
        System.out.println("product of two nos");
        int result = val1 + val2;
        assertEquals(5, result, "actual product should be 50");
    }

    private Stream<Integer> TestCases() {
        return Stream.of(100, 200, 300, 400, 5000);



    }
}



