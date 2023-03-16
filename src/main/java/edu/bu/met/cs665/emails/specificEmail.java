package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.managementSystem;

public class specificEmail extends emailBase {

    public specificEmail(managementSystem targetCustomer) {
        super(targetCustomer);
    }

    public void sendMessage(String message) {
        sendBaseMessage();
        System.out.println(message);
        System.out.println(" ");

    }
}
