import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.trasky.service.serviceImpl.CDPromotion;

public class CDComboPromotionTest {
    private final CDPromotion promotion = new CDPromotion();

    @Test
    public void testIsApplicable() {
        Map<Character, Integer> items = new HashMap<>();
        items.put('C', 1);
        items.put('D', 1);
        assertTrue(promotion.isApplicable(items));
    }

    @Test
    public void testApplyPromotion() {
        Map<Character, Integer> items = new HashMap<>();
        items.put('C', 2);
        items.put('D', 3);
        int result = promotion.apply(items);
        assertEquals(75, result); // 2*30 + 0*20 + 1*15
        assertEquals(0, items.get('C'));
        assertEquals(1, items.get('D'));
    }
}