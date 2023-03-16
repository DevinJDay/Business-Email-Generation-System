package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.managementSystem;

public abstract class emailBase extends managementSystem {
    managementSystem targetCustomer;

    public emailBase(managementSystem targetCustomer) {
        this.targetCustomer = targetCustomer;
    }

    public void sendBaseMessage() {
        targetCustomer.sendToTarget();
    }



}
