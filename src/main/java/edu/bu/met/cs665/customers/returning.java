/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: returning.java
 * Description: This is the returning class, responsible for the Returning customer segment.
 */

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the returning class.
 * It's a 'Concrete Component' in this Decorator Pattern implementation.
 * It extends the managementSystem class.
 * The target "customerSegment" is specified as "returning" here.
 * The sendToTarget() method (from super()) generates a base message for the Returning customer segment.
 */

public class returning extends managementSystem {
    public returning() {
        super();
        customerSegment = "returning";
    }
}
