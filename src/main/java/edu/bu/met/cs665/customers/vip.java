/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: vip.java
 * Description: This is the returning class, responsible for the VIP customer segment.
 */

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the vip class.
 * It's a 'Concrete Component' in this Decorator Pattern implementation.
 * It extends the managementSystem class.
 * The target "customerSegment" is specified as "VIP" here.
 * The sendToTarget() method (from super()) generates a base message for the VIP customer segment.
 */

public class vip extends managementSystem {
    public vip() {
        super();
        customerSegment = "VIP";
    }
}
