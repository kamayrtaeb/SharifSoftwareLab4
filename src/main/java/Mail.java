import interfaces.MailState;
import interfaces.MailStrategy;

public class Mail {
    private MailState state;
    private double weight;
    private MailStrategy strategy;
    public Mail (double weight, MailState state){
        this.state = state;
        this.weight = weight;

    }

    public void changeState(MailState state){
        this.state = state;
    }

    public void setStrategy(MailStrategy strategy){
        this.strategy = strategy;
    }

    public void printStatus(){
        this.state.printStatus();
    }

    public double getPrice(){
        return this.strategy.calculatePrice(weight);
    }

    public MailState getState() {
        return state;
    }
}
