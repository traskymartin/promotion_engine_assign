import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.trasky.service.serviceImpl.A3Promotion;

public class A3PromotionTest {
    private final A3Promotion promotion = new A3Promotion();

    @Test
    public void testIsApplicable() {
        Map<Character, Integer> items = new HashMap<>();
        items.put('A', 3);
        assertTrue(promotion.isApplicable(items));
        
        items.put('A', 2);
        assertFalse(promotion.isApplicable(items));
    }

    @Test
    public void testApplyPromotion() {
        Map<Character, Integer> items = new HashMap<>();
        items.put('A', 5);
        int result = promotion.apply(items);
        assertEquals(230, result); // 1*130 + 2*50
        assertEquals(0, items.get('A'));
    }
}