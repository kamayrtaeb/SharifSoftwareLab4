package states;

import interfaces.MailState;

public class InTransitState implements MailState {

    public void printStatus() {
        System.out.println("Current State is: IN-TRANSIT");
    }
}
