package edu.bu.met.cs665;


import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import edu.bu.met.cs665.customers.business;


/**
 * Write some Unit tests for your program like the examples below.
 */

public class businessTest {

    @Test
    public void sendMessage() {
        business owner = new business();
        assertNotNull(owner);

    }


}
