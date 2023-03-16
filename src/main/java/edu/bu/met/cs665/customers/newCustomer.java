/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: newCustomer.java
 * Description: This is the newCustomer class, responsible for the New customer segment.
 */

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the newCustomer class.
 * It's a 'Concrete Component' in this Decorator Pattern implementation.
 * It extends the managementSystem class.
 * The target "customerSegment" is specified as "new" here.
 * The sendToTarget() method (from super()) generates a base message for the New customer segment.
 */

public class newCustomer extends managementSystem {
    public newCustomer() {
        super();
        customerSegment = "new";
    }
}
