package PracticeSet.atlaslearnings.day36.Test;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


public class TestCase13 {
    @Test
    public void method2() {
        List<String> custList = Arrays.asList("john", "Mary", "Sheik", "Singh");
        assertThat(custList, hasSize(4));
    }
}
