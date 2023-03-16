package edu.bu.met.cs665;

public abstract class managementSystem {
    public String customerSegment;
    public void sendToTarget() {
        System.out.println("This message is for our " + customerSegment + " customers: ");
    }

}
