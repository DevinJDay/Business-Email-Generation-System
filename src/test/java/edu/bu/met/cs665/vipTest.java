package edu.bu.met.cs665;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import edu.bu.met.cs665.customers.vip;

public class vipTest {
    @Test
    public void sendMessage(){
        vip VIP = new vip();
        assertNotNull(VIP);
    }
}
