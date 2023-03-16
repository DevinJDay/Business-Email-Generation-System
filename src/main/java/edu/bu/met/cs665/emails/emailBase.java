/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: emailBase.java
 * Description: This is the 'Decorator' in this Decorator Pattern implementation.
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the emailBase class.
 * It's the 'Decorator' in this Decorator Pattern implementation.
 * It extends the managementSystem class
 * while it contains an instance of its parent class, which is used for specifying target customer segment.
 * As an abstract class, it provides a template of sending a base message to the target customer segment.
 * The sendBaseMessage() method calls the sendToTarget() method from the managementSystem class.
 */

public abstract class emailBase extends managementSystem {
    managementSystem targetCustomer;

    public emailBase(managementSystem targetCustomer) {
        this.targetCustomer = targetCustomer;
    }

    public void sendBaseMessage() {
        targetCustomer.sendToTarget();
    }



}
