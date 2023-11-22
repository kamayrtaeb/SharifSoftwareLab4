package strategies;

import interfaces.MailStrategy;

public class ExpressStrategy implements MailStrategy {
    public double calculatePrice(double weight) {
        return 3.5 * weight;
    }
}
