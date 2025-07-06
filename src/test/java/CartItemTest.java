import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.trasky.model.CartItem;

public class CartItemTest {
    @Test
    public void testCartItemCreation() {
        CartItem item = new CartItem('A', 3);
        assertEquals('A', item.getSku());
        assertEquals(3, item.getQuantity());
    }
}