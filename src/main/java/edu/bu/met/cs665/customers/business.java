/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: business.java
 * Description: This is the business class, responsible for the Business customer segment.
 */

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.managementSystem;

/**
 * This is the business class.
 * It's a 'Concrete Component' in this Decorator Pattern implementation.
 * It extends the managementSystem class
 * The target "customerSegment" is specified as "business" here.
 * The sendToTarget() method (from super()) generates a base message for the Business customer segment.
 */

public class business extends managementSystem {
    public business() {
        super();
        customerSegment = "business";
    }


}
