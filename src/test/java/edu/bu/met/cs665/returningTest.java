package edu.bu.met.cs665;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import edu.bu.met.cs665.customers.returning;

public class returningTest {
    @Test
    public void sendMessage() {
        returning customer = new returning();
        assertNotNull(customer);

    }
}
