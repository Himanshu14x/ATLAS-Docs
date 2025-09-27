package PracticeSet.atlaslearnings.day36.Test;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;

public class TestCase11 {
    @Test
    public void method1() {
        Customer customer = new Customer("John", "Abraham");
        String str = customer.toString();
        assertThat(customer, hasToString(str));
    }
}
 class Customer {
    private String fName;
    private String lName;
    public Customer(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    public String getfName() {
        return fName;
    }
    public String getLname() {
        return lName;
    }
}
