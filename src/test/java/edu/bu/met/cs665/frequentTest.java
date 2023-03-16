package edu.bu.met.cs665;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import edu.bu.met.cs665.customers.frequent;

public class frequentTest {
    @Test
    public void sendMessage() {
        frequent customer = new frequent();
        assertNotNull(customer);
    }
}
