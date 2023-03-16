/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: managementSystem.java
 * Description: This is the 'Component' in this Decorator Pattern implementation.
 */

package edu.bu.met.cs665;

/**
 * This is the managementSystem class.
 * It's the 'Component' in this Decorator Pattern implementation.
 * As an abstract class, it provides a template (sendToTarget() method)
 * of sending a message for the target customer segment
 * which is not specified here
 */
public abstract class managementSystem {
    public String customerSegment;
    public void sendToTarget() {
        System.out.println("This message is for our " + customerSegment + " customers: ");
    }

}
