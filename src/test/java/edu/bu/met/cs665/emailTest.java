package edu.bu.met.cs665;


import static org.junit.Assert.assertNotNull;
import edu.bu.met.cs665.customers.business;
import org.junit.Test;
import edu.bu.met.cs665.emails.specificEmail;

public class emailTest{
    @Test
    public void sendMessage(){
        specificEmail newEmail = new specificEmail(new business());
        assertNotNull(newEmail);
    }
}
