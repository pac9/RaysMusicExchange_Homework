import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedTest {

    Reed reed;

    @Before
    public void before(){
        reed = new Reed(100, 2.00, 5.00, 3.00,1.5);
    }

    @Test
    public void hasStock(){
        assertEquals(100, reed.getStock() );
    }

    @Test
    public void hasCost(){
        assertEquals(2.00, reed.getCost(), 0.01);

    }

    @Test
    public void hasSellingPrice(){
        assertEquals(5.00, reed.getSellingPrice(), 0.01);
    }

    @Test
    public void hasTitle(){
        assertEquals(1.5, reed.getStrength(),0.01);
    }

    @Test
    public void hasMarkUp(){
        double result = reed.calculateMarkUp(reed.getCost(), reed.getSellingPrice());
        assertEquals(3.00, result, 0.01);
    }


}
