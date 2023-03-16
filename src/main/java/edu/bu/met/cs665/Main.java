/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/15/2023
 * File Name: Main.java
 * Description: main entry point
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.customers.*;
import edu.bu.met.cs665.emails.*;

/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {
    business businessSegment = new business();
    returning returningSegment = new returning();
    frequent frequentSegment = new frequent();
    newCustomer newSegment = new newCustomer();
    vip VIPSegment = new vip();

    specificEmail toBusiness = new specificEmail(businessSegment);
    specificEmail toReturning = new specificEmail(returningSegment);
    specificEmail toFrequent = new specificEmail(frequentSegment);
    specificEmail toNew = new specificEmail(newSegment);
    specificEmail toVIP = new specificEmail(VIPSegment);

    toBusiness.sendMessage("Greetings! This is our newest opportunities for you!");
    toReturning.sendMessage("Greetings! How's your last experience with us?");
    toFrequent.sendMessage("Greetings! Consider becoming our VIP to be better served!");
    toNew.sendMessage("Greetings! Welcome to use our service!");
    toVIP.sendMessage("Greetings This is our new promotion as a Thank-you gift to VIPs!");







  }

}
