import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveredStateTest {

    @Test
    public void testPrintStatus() {
        DeliveredState deliveredState = new DeliveredState();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        deliveredState.printStatus();

        System.setOut(System.out);

        assertEquals("Current State is: DELIVERED\n", outputStream.toString());
    }
}
