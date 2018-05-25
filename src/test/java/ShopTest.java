import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop(12, 100.00, 200.00);
    }

    @Test
    public void hasStock(){
        assertEquals(12, shop.getStock());
    }

    @Test
    public void hasCost(){
        assertEquals(100.00, shop.getCost(), 0.01);
    }

    @Test
    public void hasSellingCost(){
        assertEquals(200.00, shop.getSellingPrice(), 0.01);
    }
}
