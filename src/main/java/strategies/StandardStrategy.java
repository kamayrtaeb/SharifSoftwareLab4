package strategies;

import interfaces.MailStrategy;

public class StandardStrategy implements MailStrategy {
    public double calculatePrice(double weight) {
        return 2.5 * weight;
    }
}
