import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InTransitStateTest {

    @Test
    public void testPrintStatus() {
        InTransitState inTransitState = new InTransitState();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        inTransitState.printStatus();
        System.setOut(System.out);

        assertEquals("Current State is: IN-TRANSIT\n", outputStream.toString());
    }
}
