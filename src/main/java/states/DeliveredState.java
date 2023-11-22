package states;

import interfaces.MailState;

public class DeliveredState implements MailState {
    public void printStatus() {
        System.out.println("Current State is: DELIVERED");
    }
}
