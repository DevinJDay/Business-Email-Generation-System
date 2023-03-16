/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: frequent.java
 * Description: This is the frequent class, responsible for the Frequent customer segment.
 */

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the frequent class.
 * It's a 'Concrete Component' in this Decorator Pattern implementation.
 * It extends the managementSystem class.
 * The target "customerSegment" is specified as "frequent" here.
 * The sendToTarget() method (from super()) generates a base message for the Frequent customer segment.
 */

public class frequent extends managementSystem {
    public frequent() {
        super();
        customerSegment = "frequent";
    }
}
