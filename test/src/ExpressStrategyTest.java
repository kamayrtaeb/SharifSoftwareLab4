import org.junit.Test;
import static org.junit.Assert.*;

public class ExpressStrategyTest {

    @Test
    public void testCalculatePrice() {
        ExpressStrategy expressStrategy = new ExpressStrategy();

        double weight = 2.5;
        double expectedPrice = 3.5 * weight;

        double actualPrice = expressStrategy.calculatePrice(weight);

        assertEquals(expectedPrice, actualPrice, 0.0001);
    }
}
