import interfaces.MailState;
import interfaces.MailStrategy;
import states.DeliveredState;
import states.InTransitState;
import strategies.ExpressStrategy;
import strategies.StandardStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight:");
        double weight = sc.nextDouble();
        MailState initialState = new InTransitState();
        Mail mail = new Mail(weight, initialState);
        while (mail.getState() instanceof InTransitState){
            System.out.println("Enter delivery plan (1: Standard, 2: Express):");
            int plan = sc.nextInt();
            MailStrategy strategy = (plan == 1) ? new StandardStrategy() : new ExpressStrategy();
            mail.setStrategy(strategy);

            System.out.println("Enter mail status (1: In-Transit, 2: Delivered)");
            int status = sc.nextInt();
            MailState state = (status == 1) ? new InTransitState() : new DeliveredState();
            mail.changeState(state);


            // Now Print some information
            System.out.println("Current total price = " + Double.toString(mail.getPrice()));
            mail.printStatus();
        }
        System.out.println("The mail successfully delivered!");
    }
}
