import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    Strings strings;

    @Before
    public void before(){
        strings = new Strings(40, 5.00, 12.00, "Martin");
    }

    @Test
    public void hasStock(){
        assertEquals(40, strings.getStock() );
    }

    @Test
    public void hasCost(){
        assertEquals(5.00, strings.getCost(), 0.01);

    }

    @Test
    public void hasSellingPrice(){
        assertEquals(12.00, strings.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBrand(){
        assertEquals("Martin", strings.getBrand());
    }
}
