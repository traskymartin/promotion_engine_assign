import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.trasky.service.serviceImpl.B2Promotion;

public class B2PromotionTest {
    private final B2Promotion promotion = new B2Promotion();

    @Test
    public void testIsApplicable() {
        Map<Character, Integer> items = new HashMap<>();
        items.put('B', 2);
        assertTrue(promotion.isApplicable(items));
    }

    @Test
    public void testApplyPromotion() {
        Map<Character, Integer> items = new HashMap<>();
        items.put('B', 5);
        int result = promotion.apply(items);
        assertEquals(120, result); // 2*45 + 1*30
        assertEquals(0, items.get('B'));
    }
}