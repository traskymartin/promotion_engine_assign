
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.trasky.model.CartItem;
import org.trasky.service.serviceImpl.PromotionEngine;

public class PromotionEngineTest {
    
    private final PromotionEngine engine = new PromotionEngine();

    @Test
    public void testScenarioA() {
        List<CartItem> items = Arrays.asList(
            new CartItem('A', 1),
            new CartItem('B', 1),
            new CartItem('C', 1)
        );
        assertEquals(100, engine.applyPromotions(items));
    }

    @Test
    public void testScenarioB() {
        List<CartItem> items = Arrays.asList(
            new CartItem('A', 5),
            new CartItem('B', 5),
            new CartItem('C', 1)
        );
        assertEquals(370, engine.applyPromotions(items));
    }

    @Test
    public void testScenarioC() {
        List<CartItem> items = Arrays.asList(
            new CartItem('A', 3),
            new CartItem('B', 5),
            new CartItem('C', 1),
            new CartItem('D', 1)
        );
        assertEquals(280, engine.applyPromotions(items));
    }
}