package PracticeSet.atlaslearnings.day36.Test;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;


public class TestCase12 {
    @Test
    public void method1() {
        List<String> custList = new ArrayList<>();
        assertThat(custList, empty());
    }
}
