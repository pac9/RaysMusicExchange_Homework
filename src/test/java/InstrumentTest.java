import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument(50, 30.00, 50.00, 20.00,"Woodwind", "Yamaha");
    }

    @Test
    public void hasSection(){
        assertEquals("Woodwind", instrument.getSection());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", instrument.getBrand());
    }

    @Test
    public void hasStock(){
        assertEquals(50, instrument.getStock());
    }

    @Test
    public void hasCost(){
        assertEquals(30.00, instrument.getCost(), 0.01);
    }

    @Test
    public void hasSellingCost(){
        assertEquals(50.00, instrument.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        double result = instrument.calculateMarkUp(instrument.getCost(), instrument.getSellingPrice());
        assertEquals(20.00, result, 0.01);
    }


}
