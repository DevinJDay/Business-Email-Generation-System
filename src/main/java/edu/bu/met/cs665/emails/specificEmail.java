/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: specificEmail.java
 * Description: This is the 'Concrete Decorator' in this Decorator Pattern implementation.
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the specificEmail class.
 * It's the 'Concrete Decorator' in this Decorator Pattern implementation.
 * It extends the emailBase class. The constructor specifies its target customer.
 * The new sendMessage(String message) method sends a specific message (defined at input) to the target customer, and also a base message to the target customer
 * by calling the sendBaseMessage() method
 */

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
