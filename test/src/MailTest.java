import org.junit.Test;
import static org.junit.Assert.*;

public class MailTest {

    @Test
    public void testChangeState() {
        Mail mail = new Mail(1.0, new DeliveredState());

        mail.changeState(new InTransitState());

        assertEquals(InTransitState.class, mail.getState().getClass());
    }

    @Test
    public void testSetStrategyAndGetPrice() {
        Mail mail = new Mail(2.0, new DeliveredState());
        mail.setStrategy(new ExpressStrategy());

        double expectedPrice = 3.5 * 2.0;
        assertEquals(expectedPrice, mail.getPrice(), 0.0001);
    }

    @Test
    public void testPrintStatus() {
        Mail mail = new Mail(1.0, new InTransitState());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mail.printStatus();

        System.setOut(System.out);

        assertEquals("Current State is: IN-TRANSIT\n", outputStream.toString());
    }
}
