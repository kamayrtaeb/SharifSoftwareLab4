import org.junit.Test;
import static org.junit.Assert.*;

public class StandardStrategyTest {

    @Test
    public void testCalculatePrice() {
        StandardStrategy standardStrategy = new StandardStrategy();
        double weight = 3.0;
        double expectedPrice = 2.5 * weight;

        double actualPrice = standardStrategy.calculatePrice(weight);

        assertEquals(expectedPrice, actualPrice, 0.0001);
    }
}
